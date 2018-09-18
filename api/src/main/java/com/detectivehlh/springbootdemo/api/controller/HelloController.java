package com.detectivehlh.springbootdemo.api.controller;

import com.detectivehlh.springbootdemo.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.detectivehlh.springbootdemo.core.service.HelloService;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public List<UserRole> hello() {
        return helloService.createToken("remote-key");
    }
}
