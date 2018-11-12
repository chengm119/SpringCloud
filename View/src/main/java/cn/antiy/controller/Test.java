package cn.antiy.controller;

import cn.antiy.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/index")
    public String index(){
        return helloRemote.hello();
    }


}
