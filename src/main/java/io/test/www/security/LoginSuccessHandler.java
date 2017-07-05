package io.test.www.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import io.test.www.domain.member.User;
import io.test.www.service.member.UserService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler
{
    @Autowired
    private UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth) throws IOException, ServletException
    {
        User user = new User();
        String userId = null;
        int userNo = 0;

        try {
            userId = SecurityContextHolder.getContext().getAuthentication().getName();
            userNo = userService.selectNoByUserId(userId);
            user = userService.selectByUserId(userId);
            HttpSession session  =  request.getSession();
            session.setAttribute("userId",userId);
            session.setAttribute("userName",user.getUserName());
            session.setAttribute("userNo",userNo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String ip = request.getHeader("X-FORWARDED-FOR");
        if (ip == null)
            ip = request.getRemoteAddr();

        long time = System.currentTimeMillis();
        Date today = new Date(time);

        PrintWriter out = response.getWriter();
        JSONObject obj = new JSONObject();

        obj.put("success","success");
        obj.put("returnUrl",getReturnUrl(request, response));
        out.print(obj);
        out.flush();
        out.close();

    }

    /**
     * 로그인 하기 전의 요청했던 URL을 알아낸다.
     *
     * @param request
     * @param response
     * @return
     */
    private String getReturnUrl(HttpServletRequest request, HttpServletResponse response) {
        RequestCache requestCache = new HttpSessionRequestCache();
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest == null) {
            return request.getSession().getServletContext().getContextPath();
        }
        return savedRequest.getRedirectUrl();
    }
}

