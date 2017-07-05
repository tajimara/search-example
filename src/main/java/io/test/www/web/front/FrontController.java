package io.test.www.web.front;


import io.test.www.service.member.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.*;


@Controller
public class FrontController {
	@Autowired
	private UserService userService;
    @Autowired
    private MessageSource messageSource;


    @RequestMapping(value = "/")
    public ModelAndView main(ModelMap model,HttpServletRequest request,Principal principal) throws Exception {


        return new ModelAndView("front/main",model);
    }

    /*
    메뉴 - 서비스 특징 메뉴
     */
    @RequestMapping(value = "/feature")
    public ModelAndView feature(ModelMap model,HttpServletRequest request,Principal principal) throws Exception {

        return new ModelAndView("front/submenu/feature",model);
    }

    /*
    메뉴 - 서비스 가격정책 메뉴
     */
    @RequestMapping(value = "/price")
    public ModelAndView price(ModelMap model,HttpServletRequest request,Principal principal) throws Exception {

        return new ModelAndView("front/submenu/price",model);
    }

    /*
    메뉴 - 서비스 가격정책 메뉴
     */
    @RequestMapping(value = "/support")
    public ModelAndView support(ModelMap model,HttpServletRequest request,Principal principal) throws Exception {

        return new ModelAndView("front/submenu/support",model);
    }


}
