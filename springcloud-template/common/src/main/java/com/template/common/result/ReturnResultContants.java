package com.template.common.result;

/**
 * **********************************************************
 *
 * @Project: 结果返回集使用的常量信息, 必须写注解, code与msg写在一起
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-09-28 22:03
 * @description:
 ************************************************************/
public final class ReturnResultContants {

    public static final int SUCCESS = 0;

    //登录失败
    public static final int CODE_LOGIN_WRONG = 249;
    public static final String MSG_WRONG_LOGIN = "登录失败";

    //用户注销失败
    public static final int CODE_DEL_WRONG = 251;
    public static final String MSG_DEL_WRONG = "用户注销失败";

    //用户注册失败
    public static final int CODE_REGISTER_WRONG = 290;
    public static final String MSG_REGISTER_WRONG = "注册失败";

    //用户注册时用户名重复
    public static final int CODE_REGISTER_ALREADY_EXIST = 291;
    public static final String MSG_REGISTER_ALREADY_EXIST = "该用户名已被注册";

    //登录过期
    public static final int CODE_LOGIN_EXPIRE = 292;
    public static final String MSG_LOGIN_EXPIRE = "登陆过期,需要重新登录";

    //未登录提示
    public static final int CODE_INTERCPTOR_LOGIN_ERROR = 293;
    public static final String MSG_INTERCPTOR_LOGIN_ERROR = "未登录,请先登录";

    //抢购成功,生成订单
    public static final int CODE_SECKILL_CREATE_ORDER = 999;
    public static final String MSG_SECKILL_CREATE_ORDER = "恭喜您抢购成功,订单正在生成中";


    //删除购物车提示
    public static final int CODE_DEL_CART_WRONG = 252;
    public static final String MSG_DEL_CART_WRONG = "删除失败，请重新删除";

    //购物车为空时提示
    public static final int CODE_CART_EMPTY = 000;
    public static final String MSG_CART_EMPTY = "购物车暂无商品，请前去添加！";

    //未勾选"我同意"
    public static final int CODE_IS_NOT_AGREE = 200;
    public static final String MSG_IS_NOT_AGREE = "请勾选我同意";

    //zhuy:查询商品不存在
    public static final int CODE_NOT_FIND_GOODS = 220;
    public static final String MSG_NOT_FIND_GOODS = "该商品不存在!";

    //zhuy:查询订单不存在
    public static final int CODE_NOT_FIND_ORDERS = 230;
    public static final String MSG_NOT_FIND_ORDERS = "该订单不存在!";

    //zhuy:查询订单过期失效
    public static final int CODE_ORDER_EXPIRE = 231;
    public static final String MSG_ORDER_EXPIRE = "该订单已过期失效!";

    //zhuy:删除订单
    public static final int CODE_DEL_ORDER_ORDERS = 260;
    public static final String MSG_DEL_ORDER_ORDERS = "删除成功!";

    //zhuy:删除订单
    public static final int CODE_DEL_ORDER_FAIL = 261;
    public static final String MSG_DEL_ORDER_FAIL = "删除失败!";

    //绑定手机号提示
    public static final int CODE_BIND_PHONE = 10086;
    public static final String MSG_BIND_PHONE = "请您再绑定手机号！";

    //授权登录回调失败
    public static final int CODE_CALL_BACK_FAIL = 000;
    public static final String MSG_CALL_BACK_FAIL = "授权登录回调失败！";

    //绑定手机号成功
    public static final int CODE_BIND_PHONE_SUCCESS = 666;
    public static final String MSG_BIND_PHONE_SUCCESS = "绑定手机号失败！";

    //绑定手机号失败
    public static final int CODE_BIND_PHONE_FAIL = 777;
    public static final String MSG_BIND_PHONE_FAIL = "绑定手机号失败！";
    public static final String MSG_PHONE_IS_BIND = "该用户已绑定手机";

    //评价成功
    public static final int CODE_USER_COMMENT_SUCCESS = 666;
    public static final String MSG_USER_COMMENT_SUCCESS = "感谢您的评价！";

    //评价失败
    public static final int CODE_USER_COMMENT_FAIL = 667;
    public static final String MSG_USER_COMMENT_FAIL = "评价失败！";

    //加入购物车失败
    public static final int CODE_INSERT_CART_FAIL = 668;
    public static final String MSG_INSERT_CARTL_FAIL = "插入购物车失败！";

    //修改数量失败
    public static final int CODE_UPDATE_CART_FAIL = 669;
    public static final String MSG_UPDATE_CART_FAIL = "修改数量失败！";

    //生成支付码失败
    public static final int CODE_CREATE_PAY_QCODE_FAIL = 670;
    public static final String MSG_CREATE_PAY_QCODE_FAIL = "生成支付码失败！";

    //库存不足
    public static final int CODE_NO_INVENTORY = 671;
    public static final String MSG_NO_INVENTORY = "库存不足！";

    //秒杀失败
    public static final int CODE_SEC_KILL_FAIL = 672;
    public static final String MSG_SEC_KILL_FAIL = "秒杀失败！";

    //修改个人信息成功
    public static final int CODE_MODIFY_USER_INFO_SUCCESS = 670;
    public static final String MSG_MODIFY_USER_INFO_SUCCESS = "修改个人信息成功";

    //修改个人信息失败
    public static final int CODE_MODIFY_USER_INFO_FAIL = 671;
    public static final String MSG_MODIFY_USER_INFO_FAIL = "修改个人信息失败";

    //修改订单收件人信息失败
    public static final int CODE_UPDATE_ORDER_INFO_FAIL = 672;
    public static final String MSG_UPDATE_ORDER_INFO_FAIL = "修改订单收件人信息失败";

    public static final int CODE_MODIFY_FAIL = 673;
    public static final String MSG_MODIFY_FAIL = "修改用户信息失败";

    //zhuy:删除员工信息
    public static final int CODE_DEL_EMPLOYEE_FAIL = 678;
    public static final String MSG_DEL_EMPLOYEE_FAIL = "删除失败!";
}
