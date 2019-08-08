package com.winner.microservice.service;

import com.winner.microservice.api.ConsumerDeptServiceApi;
import com.winner.microservice.api.DeptClientServiceFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author yonshuai
 * @date 2019/8/8 7:48
 */
@FeignClient(value = "MICRO-SERVICE-PROVIDER-DEPT", fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface ConsumerDeptService extends ConsumerDeptServiceApi {
}
