package com.winner.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yongs
 */
@SpringCloudApplication
@EnableFeignClients
public class ConsumerDeptAppFeign82 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptAppFeign82.class, args);
    }
}
