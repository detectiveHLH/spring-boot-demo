package com.detectivehlh.springbootdemo.core.service.impl;

import com.detectivehlh.springbootdemo.core.service.HelloService;
import com.detectivehlh.springbootdemo.data.dao.UserRoleMapper;
import com.detectivehlh.springbootdemo.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> createToken(String key) {
        List<UserRole> data = userRoleMapper.all();
        return data;
    }
}
