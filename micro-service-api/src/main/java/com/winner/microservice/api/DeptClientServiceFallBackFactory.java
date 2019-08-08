package com.winner.microservice.api;

import com.winner.microservice.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * hystrix 消费端服务降级，被实现接口的泛型参数中指定了公共的 api 接口（FeignClient 和服务提供者 controller
 * 的交互接口），用于对实现了它的 FeignClient 所发的请求进行服务降级。
 *
 * @author yonshuai
 * @date 2019/8/6 11:45
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<ConsumerDeptServiceApi> {
    @Override
    public ConsumerDeptServiceApi create(Throwable cause) {
        return new ConsumerDeptServiceApi() {
            @Override
            public Boolean add(Dept dept) {
                return false;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Dept get(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("没有对应该 ID 的信息, Consumer客户端提供的降级信要, 此刻服务 Provider 已经关闭")
                        .setDb_source("No this database in MySQL");
            }

        };
    }
}
