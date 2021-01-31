package com.example.controller;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18NController {

    @RequestMapping("/i18n")
    public String login(Local local){
        return "login";
    }
}
