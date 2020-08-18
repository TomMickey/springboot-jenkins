package com.grgbanking.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    //日志输出
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/world")
    public String helloWorld(HttpServletRequest request){
        logger.info("输出路径:---> {}", request.getPathInfo());
        logger.info("输出url:---> {}", request.getRequestURL());
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        return request.getRequestURL().toString();
    }
}
