package io.test.www.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RequestMapping(value = "/error")
@Controller
public class ErrorController {

    /**
     * 307 : 임시로 페이지가 리다이렉트 됨
     * 400 : 클라이언트의 요청이 잘못된 구문으로 구성됨
     * 401 : 접근이 혀용되지 않음
     * 404 : 지정된 URL을 처리하기 위한 자원이 존재하지 않음
     * 405 : 요청된 메서드는 허용되지 않음
     * 500 : 서버 내부 에러
     * 503 : 서버가 일시적으로 서비스를 제공할 수 없는 경우
     * */
    @RequestMapping(value = {"/307", "/400", "/401", "/403", "/404", "/405", "500", "503"})
    public ModelAndView error(HttpServletRequest request) throws Exception {
        String path = request.getServletPath().replace("/error/", "");
        return new ModelAndView("forward:/error/view/"+path);
    }

    @RequestMapping(value = {"/view/307", "/view/400", "/view/401", "/view/403", "/view/404", "/view/405", "/view/500", "/view/503"})
    public ModelAndView errorView(ModelMap model, HttpServletRequest request, Principal principal) throws Exception {
        String path = request.getServletPath().replace("/error/view/", "");
        model.put("errorCode", path);
        return new ModelAndView("/error/view/" + path, model);
    }

}
