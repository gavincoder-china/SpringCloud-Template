package com.template.consumer.feign;

import org.springframework.stereotype.Component;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-11-03 10:27
 * @description:
 ************************************************************/
@Component
public class HelloFeignImpl implements HelloFeign {
    @Override
    public String sayHello() {
        return "熔断成功";
    }
}
