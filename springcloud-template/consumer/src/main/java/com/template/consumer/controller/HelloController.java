package com.template.consumer.controller;

import com.template.common.result.ReturnResult;
import com.template.common.result.ReturnResultUtils;
import com.template.consumer.feign.HelloFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
 * @Date : 2019-11-03 10:28
 * @description:
 ************************************************************/
@Api(tags = "测试模板")
@RestController
@RequestMapping(value = "/v1")
public class HelloController {

    @Autowired
    private HelloFeign helloFeign;

    @ApiOperation(value = "测试hello world")
    @GetMapping(value = "/sayHello")
    public ReturnResult<String> sayHello() {

        return ReturnResultUtils.returnSuccess(helloFeign.sayHello());
    }

}
