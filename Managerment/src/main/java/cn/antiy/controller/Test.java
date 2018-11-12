package cn.antiy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("system in");
        return "HELLO WORLD";
    }
}
