package com.template.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-10-02 14:57
 * @description:
 ************************************************************/
@Configuration
@MapperScan("com.template.provider.mapper")
public class MybatisConfiguration {
}
