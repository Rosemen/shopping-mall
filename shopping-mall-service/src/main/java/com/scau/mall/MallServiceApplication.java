package com.scau.mall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.scau.mall.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@MapperScan(basePackageClasses = UserMapper.class)
@SpringBootApplication
public class MallServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallServiceApplication.class,args);
    }
}
