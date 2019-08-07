package com.winner.microservice.service;

import com.winner.microservice.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yonshuai
 * @date 2019/8/6 11:45
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
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
