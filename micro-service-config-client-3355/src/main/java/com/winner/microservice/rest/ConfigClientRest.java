package com.winner.microservice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author yongs
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String[] eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + Arrays.toString(eurekaServers) + "\t port: " + port;
        System.out.println("STR: " + str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + Arrays.toString(eurekaServers) + "\t port: " + port;
    }
}
