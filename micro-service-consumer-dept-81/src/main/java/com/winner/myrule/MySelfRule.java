package com.winner.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 此自定义规则类不能建立在 @ComponentScan 注解可以扫描到的包下，否则将对所有的微服务访问都
 * 使用了此规则，而不是只针对我们想要适用的特定微服务。
 * <p>
 * 自定义规则方法：新建一个类继承 AbstractLoadBalancerRule, 并实现其中的方法，详细参考源码。
 *
 * @author yongs
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
