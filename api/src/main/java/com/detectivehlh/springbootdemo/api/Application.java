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
@Import({CoreConfiguration.class, DataConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
