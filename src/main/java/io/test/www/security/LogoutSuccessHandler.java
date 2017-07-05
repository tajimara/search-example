package io.test.www.security;

import io.test.www.domain.common.ActionLog;
import io.test.www.service.common.ActionLogService;
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

    @Autowired
    private ActionLogService actionLogService;

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
                //액션 로그를 저장한다.
                ActionLog actionLog=new ActionLog();
                actionLog.setLogType("로그아웃");
                actionLog.setUserNo(userNo);
                actionLog.setIp(ip);
                actionLog.setRegDate(today);
                actionLogService.insert(actionLog);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        setDefaultTargetUrl("/");
        super.onLogoutSuccess(request, response, authentication);
    }
}

