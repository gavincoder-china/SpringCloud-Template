package com.template.common.contant;

/**
 * **********************************************************
 *
 * @Project: 常用的常量, 必须写注释
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-10-02 17:02
 * @description:
 ************************************************************/
public final class CommonContants {

    //登录用户存redis
    public static final String LOGIN_NAME_SPACE = "LOGIN_NAME_SPACE:";
    //注册用户存redis
    public static final String REGISTER_NAME_SPACE = "REGISTER_NAME_SPACE:";
    //热点缓存,存商品信息
    public static final String HOT_CACHE_GOODS = "HOT_CACHE_GOODS:";
    //热点缓存,存商品id
    public static final String HOT_CACHE_ID = "HOT_CACHE_ID:";
    //redis分布式锁
    public static final String HOT_LOCK = "HOT_LOCK:";
    //未登录时存入redis中的购物车
    public static final String NO_LOGIN_CART_SPACE = "NO_LOGIN_SPACE:";
    //用户购物车
    public static final String USER_CART = "USER_CART:";

    //秒杀业务中已经购买过的用户id保存,保存 1
    public static final String SECKILL_IS = "SECKILL_IS:";

    //注册错误
    public static final String REGISTER_ERROR = "REGISTER_ERROR";
    //经常用的ip地址
    public static final String COM_IP_ADDRESS = "COM_IP_ADDRESS:";
    //异地登录提醒
    public static final String NOT_COM_IP_ADDRESS = "您的帐号未在常用地登录，请注意帐号安全";

    public static final String HAVE_BUY = "您已购买过,请把机会让给别人!";

    public static final String NO_GOODS = "商品库存不足,请参与下次抢购!";

    public static final String PAY = "请直接付款";



    //订单状态
    public static final Byte STATE_CANCEL_ORDER = 0;
    public static final Byte STATE_TO_PAY = 1;
    public static final Byte STATE_HAVE_PAY = 2;
    public static final Byte STATE_PAY_FAILURE = 3;


    public static final String PAY_SUCCESS = "支付成功";

    public static final String PAY_FAILURE = "支付失败";

    public static final String SEC_FAIL = "抢购失败";

    public static final int MSG_SEC_FAIL = 11;

    public static final int MSG_SECL = 10;

    //经常用的ip地址
  //  public static final String COM_IP_ADDRESS = "COM_IP_ADDRESS:";
    //异地登录提醒
    //public static final String NOT_COM_IP_ADDRESS = "您的帐号未在常用地登录，请注意帐号安全";
    public static final String IS_COM_IP_ADDRESS = "欢迎登录";

    //未登录状态时的临时购物车数据
    public static final String TEMP_CART = "TEMP_CART:";
    //订单超时支付
    public static final String ORDER_EXPIRE = "ORDER_EXPIRE:";
    //库存
    public static final String INVENTORY_FULL = "库存充足!";
    public static final String INVENTORY_HALF = "库存即将殆尽,请尽快抢购!";
    public static final String INVENTORY_ZERO = "库存不足!";

    //好评颜色
    public static final String NICE_90_RED = "RED";
    public static final String NICE_70_GREED = "GREED";
    public static final String NICE_60_ORANGE = "ORANGE";
    public static final String NICE_50_BLACK = "BLACK";

    //修改生日锁定
    public static final String IS_MODIFY_BIRTHDAY = "IS_MODIFY_BIRTHDAY:";

    //"购买商品"
    public static final String BUY_GOODS_EXP = "购买商品经验";
    //登陆增加经验
    public static final String LOGIN_EXP = "登陆经验";

    //每日登陆加经验
    public static final String LOCK_LOGIN_EXP = "LOGIN_EXP:";

    //ip
    public static final String INDEX_IP = "127.0.0.1:9004/shopC?type=";









}
