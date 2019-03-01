package com.scau.mall.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
/**
 * DruidConfig:配置DruidDataSource
 *
 * @author chen
 * @date 2019/03/01
 */
@Configuration
public class DruidConfig {
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
