package com.detectivehlh.test.api.controller;

import com.detectivehlh.test.core.service.HelloService;
import com.detectivehlh.test.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RestController
 * 定义为Restful风格的API控制器
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public List<UserRole> hello() {
        return helloService.sayHello();
    }
}
