package com.ws.springboot.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.springboot.demo.service.HelloService;

import jakarta.annotation.Resource;

@RestController
public class HelloCtl {

    @Resource
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        tsd();
        String abc = helloService.abc();
        return "hello " + abc;
    }   

    public static void tsd() {
        System.out.println("tsd");
    }

}
