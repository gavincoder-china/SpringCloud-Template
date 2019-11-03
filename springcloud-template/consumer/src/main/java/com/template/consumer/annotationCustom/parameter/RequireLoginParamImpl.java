package com.template.consumer.annotationCustom.parameter;



import com.gavin.web.vo.UserVo;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


public class RequireLoginParamImpl implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(UserVo.class)
               && parameter.hasParameterAnnotation(RequireLoginParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter,
                                  ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory webDataBinderFactory) throws Exception {

        UserVo userVo = (UserVo) webRequest.getAttribute("annotation", RequestAttributes.SCOPE_REQUEST);

        if (userVo != null) {
            return userVo;
        }

        return null;
    }
}
