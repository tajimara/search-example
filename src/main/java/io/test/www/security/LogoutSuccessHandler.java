package io.test.www.security;

import io.test.www.service.member.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Component
public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
    @Autowired
    private UserService userService;


    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {
        String userId = null;
        int userNo = 0;
        if (authentication != null) {
            try {
                userId=authentication.getName();
                userNo = userService.selectNoByUserId(userId);
                // do something
                String ip = request.getHeader("X-FORWARDED-FOR");
                if (ip == null)
                    ip = request.getRemoteAddr();

                long time = System.currentTimeMillis();
                Date today = new Date(time);

                //response.sendRedirect(getReturnUrl(request, response));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        setDefaultTargetUrl("/");
        super.onLogoutSuccess(request, response, authentication);
    }
}

