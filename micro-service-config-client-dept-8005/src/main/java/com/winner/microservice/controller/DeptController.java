package com.winner.microservice.controller;

import com.winner.microservice.api.ConsumerDeptServiceApi;
import com.winner.microservice.entities.Dept;
import com.winner.microservice.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 传统的 controller 一般不实现任何接口或者继承任何父类，那样的话在单体应用中应该是没什么
 * 弊端的，但是在微服务应用中，服务提供者的 controller 会被服务消费者调用，现在消费端流行
 * 的调用方式是创建接口使用 feign 动态代理，接口中的方法上都要加上 @RequestMapping 注解，
 * 这些注解的 value 值以及所标注的方法，是和服务提供者的 controller 一样的，所以干脆就抽
 * 象一个接口出来，方法上标注好各种注解，让服务提供者和 feign 消费者一起继承或实现，并且实
 * 现类中的方法不再需要标注此接口已标注的注解，除非想要覆盖这部分注解。
 *
 * @author yongs
 */
@RestController
public class DeptController implements ConsumerDeptServiceApi {

    @Autowired
    private DeptService service;

    @Override
    public Boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @Override
    public Dept get(Long id) {
        return service.get(id);
    }

    @Override
    public List<Dept> list() {
        return service.list();
    }
}
