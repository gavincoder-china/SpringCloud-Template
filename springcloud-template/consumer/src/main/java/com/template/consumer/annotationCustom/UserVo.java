package com.template.consumer.annotationCustom;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * **********************************************************
 *
 * @Project:  缓存专用的用户对象
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-10-17 11:51
 * @description:
 ************************************************************/
@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = -567136965701406919L;

    @ApiModelProperty(value = "缓存用户id")
    private Long userID;

    @ApiModelProperty(value = "缓存用户名")
    private String userName;

    @ApiModelProperty(value = "缓存用户手机号")
    private String phone;

    @ApiModelProperty(value = "缓存用户密码")
    private String password;

    @ApiModelProperty(value = "是否同意登录(0-不同意，1-同意)")
    private int isAgree = 1;

    @ApiModelProperty(value = "临时token")
    private String temp;

}
