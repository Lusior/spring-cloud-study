package com.winner.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author yonshuai
 * @date 2019/8/6 15:20
 */
@SpringCloudApplication
@EnableHystrixDashboard
public class HystrixDashboardApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApp9001.class, args);
    }
}
