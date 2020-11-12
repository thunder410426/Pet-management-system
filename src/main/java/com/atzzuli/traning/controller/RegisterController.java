package com.atzzuli.traning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @RequestMapping("/doregistry")
    public String registry(){
        return "login";
    }

    @RequestMapping("/registry")
    public String registry1(){
        return "commons/registry";
    }
}
