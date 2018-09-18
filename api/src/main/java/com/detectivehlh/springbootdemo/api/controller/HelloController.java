package com.detectivehlh.springbootdemo.api.controller;

import com.detectivehlh.springbootdemo.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.detectivehlh.springbootdemo.core.service.HelloService;

import java.util.List;

/**
 * RestController
 * 定义为Restful风格的API控制器
 */
@RestController
public class HelloController {
    /**
     * Autowired注解，从容器中获取HelloService服务
     */
    @Autowired
    private HelloService helloService;

    /**
     * 该注解将HTTP GET请求方法映射到特定的处理方法上
     * @return
     */
    @GetMapping("/hello")
    public List<UserRole> hello() {
        return helloService.createToken("remote-key");
    }
}
