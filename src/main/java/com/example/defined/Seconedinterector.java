package com.example.defined;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 多拦截器顺序
 * com.example.defined.MyInterceptor-----pre
 * com.example.controller.Seconedinterectorpre2
 * com.example.controller.InterceptorController
 * com.example.controller.Seconedinterectorpost2
 * com.example.defined.MyInterceptor-----post
 * 页面开始执行
 * com.example.controller.Seconedinterectorfater2
 * com.example.defined.MyInterceptor-----after
 */
public class Seconedinterector implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(this.getClass().getName()+"pre2");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(this.getClass().getName()+"post2");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(this.getClass().getName()+"fater2");
    }
}
