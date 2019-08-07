package com.winner.microservice.controller;

import com.winner.microservice.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yongs
 */
@RestController
public class DeptControllerConsumer {

    //这是固定的通过 ip 加 port 访问，与微服务的架构理念背离，不能实现负载均衡
    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 通过微服务名称访问微服务，可以透过注册中心实现负载均衡
     */
    private static final String REST_URL_PREFIX = "http://MICRO-SERVICE-PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
