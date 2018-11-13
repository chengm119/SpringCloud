package cn.antiy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloTest {

    @Value("${devp.desc}")
    private String desc;

    @RequestMapping("/hello/test")
    public String from() {
        return this.desc;
    }
}
