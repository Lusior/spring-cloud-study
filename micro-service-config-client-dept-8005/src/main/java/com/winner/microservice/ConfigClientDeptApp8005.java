package com.winner.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yongs
 */
@SpringCloudApplication
@MapperScan("com.winner.microservice.dao")
public class ConfigClientDeptApp8005 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientDeptApp8005.class, args);
    }
}
