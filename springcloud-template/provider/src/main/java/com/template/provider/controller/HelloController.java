package com.template.provider.controller;

import com.template.provider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-11-03 10:24
 * @description:
 ************************************************************/
@RestController
@RequestMapping(value = "/provider")
public class HelloController {

    @Autowired
    private HelloService helloService;


    @GetMapping(value = "/sayHello")
    public String sayHello() {

        return helloService.sayHello();
    }
}
