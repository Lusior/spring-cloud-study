package com.winner.microservice.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yongs
 */
@Configuration
public class ConfigBean {

    /**
     * 如果不指定负载均衡的算法，则使用默认的 ZoneAvoidanceRule 算法，若指定，则使用指定
     * 的算法
     *
     * @return 指定的轮询算法规则：IRule bean
     */
    @Bean
    public IRule myRule() {

        //一、轮询算法
        //return new RoundRobinRule();

        //二、会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，还有并发的连接数量超过
        //阈值的服务，然后对剩余的服务列表按照轮询策略进行访问
        //return new AvailabilityFilteringRule();

        //三、随机算法
        //return new RandomRule();

        //四、根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。
        //刚启动时如果统计信息不足，则使用RoundRobinRule策略，等统计信息足够，会切换到
        //WeightedResponseTimeRule
        //return new WeightedResponseTimeRule();

        //五、先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定次数内会进行重试，
        //仍然失败多次后，会只获取可用的服务
        //return new RetryRule();

        //六、会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的
        //服务
        //return new BestAvailableRule();

        //七、默认规则,复合判断server所在区域的性能和server的可用性选择服务器
        return new ZoneAvoidanceRule();
    }

}