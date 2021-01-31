package com.example.defined;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * 执行顺序
 * com.example.defined.MyInterceptor-----pre
 * com.example.controller.InterceptorController
 * com.example.defined.MyInterceptor-----post
 * 页面开始执行
 * com.example.defined.MyInterceptor-----after
 *
 * 发生异常执行顺序
 * com.example.defined.MyInterceptor-----pre
 * com.example.defined.MyInterceptor-----after
 */
public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(this.getClass().getName()+"-----pre");
        //链式 true才会继续执行
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(this.getClass().getName()+"-----post");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(this.getClass().getName()+"-----after");
    }


}
