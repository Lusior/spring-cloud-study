package com.winner.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yongs
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigServerApp3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp3344.class, args);
    }
}
