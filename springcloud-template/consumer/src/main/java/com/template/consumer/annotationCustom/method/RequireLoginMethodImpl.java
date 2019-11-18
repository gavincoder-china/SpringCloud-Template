package com.template.consumer.annotationCustom.method;



import com.alibaba.fastjson.JSONObject;
import com.template.common.contant.CommonContants;
import com.template.common.result.ReturnResultContants;
import com.template.common.result.ReturnResultUtils;
import com.template.common.util.RedisUtil;
import com.template.consumer.annotationCustom.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;


public class RequireLoginMethodImpl implements HandlerInterceptor {

    @Autowired
    private RedisUtil redisUtils;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();


        // 判断方法是否添加了这个注解
        RequireLoginMethod methodAnnotation = method.getAnnotation(RequireLoginMethod.class);

        if (methodAnnotation != null) {

            // 从 http 请求头中取出 token
            Object token = request.getHeader("token");


            if (!ObjectUtils.isEmpty(token)) {

                Long userToken = Long.parseLong(token.toString());
                String jsonStr = (String) redisUtils.get(CommonContants.LOGIN_NAME_SPACE + userToken);
                if (!ObjectUtils.isEmpty(jsonStr)) {


                    UserVo userVo = JSONObject.parseObject(jsonStr, UserVo.class);

                    request.setAttribute("annotation", userVo);

                    return true;
                }
            }

            response.setCharacterEncoding("UTF-8");
            PrintWriter pw = response.getWriter();

            pw.write(JSONObject.toJSONString(
                    ReturnResultUtils.returnFail(
                            ReturnResultContants.CODE_INTERCPTOR_LOGIN_ERROR,
                            ReturnResultContants.MSG_INTERCPTOR_LOGIN_ERROR)));

            pw.flush();
            pw.close();
            return false;
        }

        return true;

    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
