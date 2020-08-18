package com.grgbanking.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @Autowired
    private WebApplicationContext webApplicationConnect;

    //日志输出
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/world")
    public String helloWorld(HttpServletRequest request){
        logger.info("输出sessionId:---> {}", request.getSession().getId());
        logger.info("输出url:---> {}", request.getRequestURL());
        String[] activeProfiles = webApplicationConnect.getEnvironment().getActiveProfiles();
        logger.info("输出配置文件名称:----> {}", activeProfiles);
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        return request.getRequestURL().toString();
    }
}
