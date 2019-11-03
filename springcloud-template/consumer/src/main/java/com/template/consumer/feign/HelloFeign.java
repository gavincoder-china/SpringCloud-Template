package com.template.consumer.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider",fallback = HelloFeignImpl.class)
public interface HelloFeign {

    @GetMapping(value = "/provider/sayHello")
    String sayHello();
}
