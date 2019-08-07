package com.winner.microservice;

import com.winner.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 将 @RibbonClient 注解加在主启动类上并指定针对的微服务名称与自定义的负载均衡规则，
 * 即可使用我们定制的负载均衡规则
 *
 * @author yongs
 */
@SpringCloudApplication
@RibbonClient(name = "MICRO-SERVICE-PROVIDER-DEPT", configuration = MySelfRule.class)
public class ConsumerDeptApp81 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptApp81.class, args);
    }
}
