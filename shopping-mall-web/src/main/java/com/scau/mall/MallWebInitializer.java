package com.scau.mall;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * MallWebInitializer:初始化器
 *
 * @author chen
 * @date 2019/03/02
 */
public class MallWebInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MallWebApplication.class);
    }
}
