package com.winner.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yongs
 */
@SpringCloudApplication
@MapperScan("com.winner.microservice.dao")
public class HystrixDeptApp8004 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDeptApp8004.class, args);
    }
}
