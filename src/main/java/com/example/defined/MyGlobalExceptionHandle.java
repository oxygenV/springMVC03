package com.example.defined;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyGlobalExceptionHandle {
    //定义的异常跳转类1
    //会优先匹配小范围异常
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public ModelAndView exception(Exception exception){
        System.out.println("global");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",exception);
        return mv;
    }
    //定义的异常跳转类2
    @ExceptionHandler(value = {Exception.class})
    public ModelAndView exception2(Exception exception){
        System.out.println("global");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",exception);
        return mv;
    }
}
