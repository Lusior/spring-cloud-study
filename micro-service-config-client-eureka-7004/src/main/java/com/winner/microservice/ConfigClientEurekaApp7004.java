package com.winner.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 *
 * @author yongs
 */
@SpringCloudApplication
@EnableEurekaServer
public class ConfigClientEurekaApp7004 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApp7004.class, args);
    }
}
