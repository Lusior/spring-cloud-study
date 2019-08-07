package com.winner.microservice.controller;

import com.winner.microservice.entities.Dept;
import com.winner.microservice.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yongs
 */
@RestController
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping("/feign/dept/add")
    public Boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping("/feign/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @GetMapping("/feign/dept/list")
    public List list() {
        return deptClientService.list();
    }
}
