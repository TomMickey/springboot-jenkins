package com.grgbanking.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/world")
    public String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        return request.getRequestURL().toString();
    }
}
