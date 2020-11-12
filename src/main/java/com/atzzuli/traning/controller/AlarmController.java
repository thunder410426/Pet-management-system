package com.atzzuli.traning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlarmController {
    @RequestMapping("alarm-config")
    public String alarmconfig(){
        return "alarm/alarm-config";
    }
    @RequestMapping("alarm-msg")
    public String alarmmsg(){
        return "alarm/alarm-msg";
    }
}
