package com.template.common.result;

/**
 * @author Gavin
 * @description 返回结果集的code与msg,替代静态常量
 *  结果返回集使用的常量信息, 必须写注解, code与msg写在一起
 * @date 2019-11-03 11:10
 * @return
 * @throws
 * @since
 */

public enum ReturnEnum {

    LOGIN_WRONG(1,"登录失败"),
    USER_DEL_WRONG(2,"用户注销失败"),
    USER_REGISTER_WRONG(3,"用户注册失败"),
    REGISTER_ALREADY_EXIST(4,"该用户名已被注册"),
    LOGIN_EXPIRE(5,"登陆过期,需要重新登录"),
    NOT_LOGIN_ERROR(6,"未登录,请先登录");

    /**
     * @description  返回码
     * @author Gavin
     * @date 2019-11-03 11:19
    */
    int Code;
    /**
     * @description  返回信息
     * @author Gavin
     * @date 2019-11-03 11:20
    */
    String Msg;


    /**
     * @description  配对方法
     * @author Gavin
     * @date 2019-11-03 11:20
    */
    public static ReturnEnum getByValue(int value) {
        for (ReturnEnum transactType : values()) {
            if (transactType.getCode() == value) {
                return transactType;

            }
        }
        return null;
    }

    ReturnEnum(int code, String msg) {
        Code = code;
        Msg = msg;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }
}
