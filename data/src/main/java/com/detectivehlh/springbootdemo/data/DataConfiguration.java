package com.detectivehlh.springbootdemo.data;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author duzhengkang
 * @date 2018/6/25
 */
@ComponentScan
@Configuration
@MapperScan("com.detectivehlh.springbootdemo.data.dao")
public class DataConfiguration {

}
