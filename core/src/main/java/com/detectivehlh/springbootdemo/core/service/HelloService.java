package com.detectivehlh.springbootdemo.core.service;

import com.detectivehlh.springbootdemo.domain.entity.UserRole;

import java.util.List;

public interface HelloService {
    List<UserRole> createToken(String key);
}
