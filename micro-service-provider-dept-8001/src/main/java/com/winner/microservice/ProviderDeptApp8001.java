package com.winner.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yongs
 */
@SpringCloudApplication
@MapperScan("com.winner.microservice.dao")
public class ProviderDeptApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptApp8001.class, args);
    }
}
