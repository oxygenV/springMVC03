package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping("/testInterceptor")
    public String test(){
        System.out.println(this.getClass().getName());
        return "success";
    }
}
