package com.winner.microservice.api;

import com.winner.microservice.entities.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 抽象一个接口出来，方法上标注好各种注解，让服务提供者和 feign 消费者一起继承或实现，并且实
 * 现类中的方法不再需要标注此接口已标注的注解，除非想要覆盖这部分注解。
 *
 * @author yonshuai
 * @date 2019/8/6 8:48
 */
public interface ConsumerDeptServiceApi {

    @PostMapping("/dept/add")
    Boolean add(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> list();
}
