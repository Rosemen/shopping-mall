package com.scau.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * MallDaoApplication:Springboot主启动类
 *
 * @author chen
 * @date 2019/03/01
 */
@SpringBootApplication
public class MallDaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallApiApplication.class,args);
    }
}
