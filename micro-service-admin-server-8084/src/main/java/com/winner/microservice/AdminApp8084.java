package com.winner.microservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yonshuai
 * @date 2019/8/17 20:21
 */
@SpringCloudApplication
@EnableAdminServer
public class AdminApp8084 {
    public static void main(String[] args) {
        SpringApplication.run(AdminApp8084.class, args);
    }
}
