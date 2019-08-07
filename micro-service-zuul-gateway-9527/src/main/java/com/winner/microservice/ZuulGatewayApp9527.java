package com.winner.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yonshuai
 * @date 2019/8/6 17:00
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulGatewayApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApp9527.class, args);
    }
}
