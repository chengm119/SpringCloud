package cn.antiy.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello() {
        return "hello tom this messge send failed ";
    }
}
