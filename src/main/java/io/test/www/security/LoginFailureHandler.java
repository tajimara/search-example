package io.test.www.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler
{
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException auth) throws IOException, ServletException
    {
        String result="";
        if(auth.getMessage().equals("fail")) {
            result = "fail";
        } else if (auth.getMessage().equals("disabled")) {
            result = "disabled";
        } else {
            result = "unknown";
        }

        PrintWriter out = response.getWriter();
        JSONObject obj = new JSONObject();
        obj.put("success",result);
        out.print(obj);
        out.flush();
        out.close();
    }
}