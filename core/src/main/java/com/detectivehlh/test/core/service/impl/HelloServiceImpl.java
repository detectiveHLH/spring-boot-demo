package com.detectivehlh.test.core.service.impl;

import com.detectivehlh.test.core.service.HelloService;
import com.detectivehlh.test.data.dao.UserRoleMapper;
import com.detectivehlh.test.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> sayHello() {
        List<UserRole> data = userRoleMapper.all();
        return data;
    }
}
