package com.detectivehlh.test.data;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author duzhengkang
 * @date 2018/6/25
 */
@ComponentScan
@Configuration
@MapperScan("com.detectivehlh.test.data.dao")
public class DataConfiguration {

}
