package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 当error方法发生异常时，会跳转到exception方法，并进入对应界面
 *
 * 在当前类内部定义的异常处理handler只能处理当前类异常
 * 通过@ControllerAdvice注解进行标注为全局异常处理类
 */
@Controller
public class ExceptionController {
    @RequestMapping("/exception")
    public String error(){
        int i=10/0;
        return "success";
    }

    //
    @ResponseStatus(reason = "页面跳转失败，原因为：---",value = HttpStatus.BAD_REQUEST)
    @RequestMapping("/exception2")
    public String error2(){
        System.out.println("exception2");
        return "success";
    }

    //定义的异常跳转类1
    //会优先匹配小范围异常
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public ModelAndView exception(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",exception);
        return mv;
    }
    //定义的异常跳转类2
    @ExceptionHandler(value = {Exception.class})
    public ModelAndView exception2(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",exception);
        return mv;
    }
}
