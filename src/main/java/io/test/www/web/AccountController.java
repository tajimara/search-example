package io.test.www.web;

import io.test.www.domain.member.User;
import io.test.www.domain.member.Term;
import io.test.www.service.communication.MailService;
import io.test.www.service.member.TermAgreeService;
import io.test.www.service.member.UserService;
import io.test.www.service.member.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nari on 15. 11. 6..
 */
@RequestMapping(value="/account")
@Controller
public class AccountController {

    @Autowired
    private UserService userService;
    @Autowired
    private TermService termService;
    @Autowired
    private TermAgreeService termAgreeService;
    @Autowired
    private MailService mailService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value={"/login","/login/{error}"})
    public ModelAndView loginForm(ModelMap model,@RequestParam(value = "hl",required = false, defaultValue = "ko" )  String hl,
                              @RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout,
                              HttpServletRequest request){

        return new ModelAndView("front/account/login",model);
    }

    @RequestMapping(value={"/join"})
    public ModelAndView joinForm(ModelMap model,@RequestParam(value = "hl",required = false, defaultValue = "ko" )  String hl,
                              @RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout,
                              HttpServletRequest request){

        try {
            Term termMembershipData = termService.selectByTermTypeIsActive("T001", true);
            Term termPrivacyData = termService.selectByTermTypeIsActive("T002", true);
            model.put("termMembershipData", termMembershipData);
            model.put("termPrivacyData", termPrivacyData);
        } catch (Exception ex){
            ex.printStackTrace();
        }


        return new ModelAndView("front/account/join",model);
    }
    @RequestMapping(value = "/modify")
    public @ResponseBody
    Map<String, String> updateUser(Principal principal, String newPassword){
        Map<String, String> map = new HashMap<String, String>();
        try {
            User user = userService.selectByUserId(principal.getName());

            String passwordHash = passwordEncoder.encode(newPassword);
            String authKey = passwordEncoder.encode("queryjet!!@@##"+user.getUserPassword());
            user.setAuthKey(authKey);
            user.setUserPassword(passwordHash);

            userService.updateUser(user);

            map.put("success", "true");

        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
        }
        return map;
    }

    @RequestMapping(value = "/join/insert",method= RequestMethod.POST)
    public @ResponseBody
    Map<String, String> insertUser(HttpServletRequest request,HttpServletResponse response, User user){
        Map<String, String> map = new HashMap<String, String>();
        try {
            String passwordHash = passwordEncoder.encode(user.getUserPassword());
            String authKey = passwordEncoder.encode("queryjet!!@@##"+user.getUserPassword());
            long time = System.currentTimeMillis();
            Date today = new Date(time);

            user.setUserPassword(passwordHash);
            user.setAuthFlag(false);
            user.setAuthKey(authKey);                   //이메일 인증용 키를 하나 발급하여 넣는다.
            user.setJoinedDate(today);
            int userNo = userService.insertUser(user);

            String emailText ="안녕하십니까? 쿼리젯입니다.</br>"
                    +"아래를 클릭해주시면 최종적으로 가입이 완료 됩니다. </br></br>"
                    +"<a href='https://www.searchspace.io/account/auth_check?authKey="+authKey+"'>https://www.searchspace.io/join/auth_check?authKey="+authKey+"</a>";

            String url = "https://www.searchspace.io";
            String serverName = String.valueOf(request.getRequestURL());
            if(serverName.indexOf("www.queryjet.com") == -1){
                String serverPort = String.valueOf(request.getServerPort());
                url = serverName.split(serverPort)[0] + serverPort;
            }
            url += "/account/auth_check?authKey="+authKey;

            mailService.sendMail("가입을 위한 최종 확인을 부탁드립니다",emailText,"no-reply@queryjet.com", user.getUserId(), url, "mail-form/join_confirm_email.html", true);
            map.put("success", "true");
            //response.sendRedirect(request.getContextPath() + "/join/result");
        } catch (Exception e) {
            e.printStackTrace();
            if(e.toString().contains("javax.mail.AuthenticationFailedException")) {
                map.put("success", "mailFail");
            } else {
                map.put("success", "false");
            }
        }
        return map;
    }
    @RequestMapping(value = "/join/userIdCheck",method=RequestMethod.POST)
    public void userIdCheck(HttpServletRequest request,HttpServletResponse response){
        String contentType= "text/json;charset=UTF-8";
        response.setContentType(contentType);
        String userId = request.getParameter("userId");
        try {
            boolean result=userService.findByUserId(userId);

            if (result == false) {
                response.getWriter().print(false);  //아이디가 존재한다면 false 이다.
            } else {
                //String data = "{\"status\":\"OK\",\"message\":\"이메일 "+userId+" 사용 가능합니다.\"}";
                response.getWriter().print(true);   //아이디가 존재하지 않는다면 true 이다.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
 * 작성일 : 2013년 12월 28일
 * 작성자 : 김지훈
 * 목적 : 중복 아이디 체크
 *
 */
    @RequestMapping(value = "/auth_check",method=RequestMethod.GET)
    public ModelAndView authCheck(ModelMap model,HttpServletRequest request,HttpServletResponse response){
        String authKey=request.getParameter("authKey");
        String showText="";
        try {
            User user = userService.selectByAuthKey(authKey);
            if (user != null) {
                //존재하지만 이미 인증한 경우
                if(user.isAuthFlag()) {
                    model.put("result",'2');
                } else {
                    long time = System.currentTimeMillis();
                    Date today = new Date(time);
                    user.setAuthFlag(true);
                    user.setAuthenticatedDate(today);
                    userService.updateUser(user);
                    model.put("result",'1');
                }
            } else {
                //존재하지 않으면 0
                model.put("result",'0');
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("front/account/auth_check",model);
    }


    @RequestMapping(value="/password_reset")
    public ModelAndView passwordResetForm(ModelMap model,@RequestParam(value = "hl",required = false, defaultValue = "ko" )  String hl){

        return new ModelAndView("front/account/password_reset",model);
    }

    @RequestMapping(value = "/password_reset/process",method=RequestMethod.POST)
    public @ResponseBody
    Map<String, String> passwordResetProcess(HttpServletRequest request,HttpServletResponse response){
        Map<String, String> map = new HashMap<String, String>();
        try {
            String userId = request.getParameter("userId");
            User user = userService.selectByUserId(userId);

            if (user != null) {
                long time = System.currentTimeMillis();
                Date today = new Date(time);

                String passwordKey = passwordEncoder.encode(today.toString() + userId);
                user.setPasswordKey(passwordKey);
                userService.updateUser(user);
                String emailText = "</br>"
                        + "아래를 클릭해주시면 패스워드를 변경 가능합니다.  </br></br>"
                        + "<a href='https://www.queryjet.com/account/password_confirm?passwordKey=" + passwordKey + "'>https://www.queryjet.com/login/reset_password?passwordKey=" + passwordKey + "</a>";

                String url = "http://www.queryjet.com";
                String serverName = String.valueOf(request.getRequestURL());
                if(serverName.indexOf("www.queryjet.com") == -1){
                    String serverPort = String.valueOf(request.getServerPort());
                    url = serverName.split(serverPort)[0] + serverPort;
                }
                url += "/account/password_confirm?passwordKey="+passwordKey;

                mailService.sendMail("쿼리젯 비밀번호 찾기", emailText, "no-reply@queryjet.com", userId, url, "mail-form/password_reset_email.html", true);
                map.put("success", "true");
            } else {
                map.put("success", "false");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "error");
        }
        return map;
    }

    @RequestMapping(value="/password_confirm")
    public ModelAndView passwordConfirm(ModelMap model,@RequestParam(value = "hl",required = false, defaultValue = "ko" )  String hl,
                                       @RequestParam(value = "error", required = false) String error,
                                       HttpServletRequest request){
        try {
            String passwordKey = request.getParameter("passwordKey");
            User user = userService.selectByPasswordKey(passwordKey);
            if (user != null) {
                if (user.getPasswordKey().equals(passwordKey)){
                    model.put("userId",user.getUserId());
                    model.put("authPasswordOk","true");
                    model.put("passwordKey", passwordKey);
                } else {
                    //사실상 필요없는 코드
                    model.put("userId",user.getUserId());
                    model.put("authPasswordOk","false");
                    model.put("passwordKey","");
                }
            } else {
                model.put("userId","");
                model.put("authPasswordOk","false");
                model.put("passwordKey","");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("front/account/password_confirm",model);
    }

    @RequestMapping(value = "/password_confirm/process",method=RequestMethod.POST)
    public @ResponseBody
    Map<String, String> passwordConfirmProcess(HttpServletRequest request,HttpServletResponse response){
        Map<String, String> map = new HashMap<String, String>();
        try {
            String resetPassword = request.getParameter("userPassword");
            String passwordKey = request.getParameter("passwordKey");
            User user = userService.selectByPasswordKey(passwordKey);
            String userPassword =passwordEncoder.encode(resetPassword);
            user.setUserPassword(userPassword);
            userService.updateUser(user);
            map.put("success", "true");
        } catch (Exception e) {
            map.put("success", "false");
            e.printStackTrace();
        }
        return map;
    }

}
