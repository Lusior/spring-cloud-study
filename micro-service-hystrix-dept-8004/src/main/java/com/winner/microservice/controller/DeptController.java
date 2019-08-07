package com.winner.microservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.winner.microservice.entities.Dept;
import com.winner.microservice.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yongs
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    /**
     * 一旦调用服务方法失败并抛出了异常信息后，会自动调用 @HystrixCommand 标注好
     * 的fallbackMethod调用类中的指定方法
     *
     * @param id id
     * @return 查询结果
     */
    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);

        if (dept == null) {
            throw new RuntimeException("该ID：" + id + "没有对应的信息");
        }

        return dept;
    }

    @SuppressWarnings("unused")
    public Dept processHystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("没有对应该 ID 的信息, null@HystrixCommand")
                .setDb_source("No this database in MySQL");
    }

}
