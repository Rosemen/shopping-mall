package com.scau.mall;

import com.scau.mall.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = UserMapper.class)
@SpringBootApplication
public class MallWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWebApplication.class,args);
    }
}
