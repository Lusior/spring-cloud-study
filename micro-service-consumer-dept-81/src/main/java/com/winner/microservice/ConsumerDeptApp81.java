package com.winner.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 将 @RibbonClient 注解加在主启动类上并指定针对的微服务名称与自定义的负载均衡规则，即可使用我
 * 们定制的负载均衡规则:
 * 例@RibbonClient(name = "MICRO-SERVICE-PROVIDER-DEPT", configuration = MySelfRule.class)
 * <p>
 * 不过这样的方式需要注意的点比较多，另一种方式是在 application.yml 中根层级配置，如下:
 * <p>
 * # 为特定服务指定自定义的负载均衡策略
 * MICRO-SERVICE-PROVIDER-DEPT:  # 指定服务的名称
 *   ribbon:
 *     NFLoadBalancerRuleClassName: com.winner.myrule.MySelfRule  # 为其单独指定的策略
 *
 * @author yongs
 */
@SpringCloudApplication
public class ConsumerDeptApp81 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptApp81.class, args);
    }
}
