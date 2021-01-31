package com.example.controller;

import com.example.entity.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @ResponseBody 向前台返回数据
 *
 * @RequestBody  拿到前台传递的数据（多个参数一次性拿到）
 */
@Controller
public class ResponseBodyController {

    @ResponseBody
    @RequestMapping("/json")
    public List<User> json(){
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"zhangsan",15,"woman"));
        list.add(new User(1,"zhangsan",15,"woman"));
        list.add(new User(1,"zhangsan",15,"woman"));
        list.add(new User(1,"zhangsan",15,"woman"));
        return list;
    }

    //前台发送数据，后台接收
    @RequestMapping("/request")
    public String requestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    //前台发送json数据，后台接收
    @RequestMapping("/requestjson")
    public String getJson(@RequestBody User user) {
        System.out.println(user);
        return "success";
    }
    //获取请求头信息，请求参数
    @RequestMapping("/test")
    public String entity(HttpEntity<String> entity){
        System.out.println(entity);
        return "success";
    }
    //自定义响应头
    @RequestMapping("/test2")
    public ResponseEntity<String> entity2(){
        String str = "<h1>hello,mvc</h1>";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Set-Cookie","user=zhangsan");
        return new ResponseEntity<String>(str,httpHeaders, HttpStatus.OK);
    }

}
