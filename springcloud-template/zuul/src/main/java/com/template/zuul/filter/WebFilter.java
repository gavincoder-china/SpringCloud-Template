package com.template.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-11-03 10:45
 * @description:
 ************************************************************/
@Component
@Slf4j
public class WebFilter extends ZuulFilter {
    /**
     * @return java.lang.String
     * @throws
     * @description 过滤器类型  route期间 post之后 error 错误
     * @author Gavin
     * @date 2019-10-28 14:18
     * @since
     */
    @Override
    public String filterType() {
        //前置过滤器
        return "pre";
    }

    /**
     * @return int
     * @throws
     * @description 优先级, 数字越小, 优先级越高
     * @author Gavin
     * @date 2019-10-28 14:20
     * @since
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * @return boolean
     * @throws
     * @description 过滤器开关
     * @author Gavin
     * @date 2019-10-28 14:20
     * @since
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * @return java.lang.Object
     * @throws
     * @description 过滤器需要做的事
     * @author Gavin
     * @date 2019-10-28 14:20
     * @since
     */
    @Override
    public Object run() {

        log.info("执行Zuul过滤器");

        RequestContext context = RequestContext.getCurrentContext();

        HttpServletRequest request = context.getRequest();

        String id = request.getSession().getId();

        //这边做业务逻辑,下面成功的话,设置为true
        context.setSendZuulResponse(true);
        context.setResponseStatusCode(511);

        return null;
    }
}
