package com.detectivehlh.springbootdemo.api;

import com.detectivehlh.springbootdemo.core.CoreConfiguration;
import com.detectivehlh.springbootdemo.data.DataConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import javax.xml.crypto.Data;

@SpringBootApplication
@MapperScan("com.detectivehlh.springbootdemo.data.mapper")
// 使core和data的依赖能够被扫描到容器中去
@Import({CoreConfiguration.class, DataConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
