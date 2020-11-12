package com.atzzuli.traning.controller;

import com.atzzuli.traning.entity.Identity;
import com.atzzuli.traning.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController{
    @RequestMapping("/login")
    public String login(){
        return"login";
    }

    @Autowired
    private LoginService loginservice;
    @RequestMapping("login.action")
    public ModelAndView login(Identity identity, HttpServletRequest request, HttpSession session, Model model, Map<String,Object> map)throws Exception{
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        identity.setUsername(username);
        identity.setPassword(password);
        identity = this.loginservice.login(identity);
        if(identity!=null) {
            session.setAttribute("identity",username);
            mav.setViewName("dashboard");
           }
        else {
            session.setAttribute("errmsg","用户名或密码错误!请重新输入");
            mav.setViewName("login");
        }
        return mav;
    }

}
