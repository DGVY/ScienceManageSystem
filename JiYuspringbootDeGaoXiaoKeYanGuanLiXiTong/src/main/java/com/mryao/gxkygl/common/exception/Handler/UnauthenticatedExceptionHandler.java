package com.mryao.gxkygl.common.exception.Handler;

import com.mryao.gxkygl.common.result.Result;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * @author zhouyang
 * @Date 2017-05-22 15:16
 * @Description 没有登录
 * @Version 1.0
 */
@Component
public class UnauthenticatedExceptionHandler implements ExceptionHandler {
    public Object handler(HttpServletResponse response, Throwable e) {
        if(e instanceof UnauthenticatedException){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return Result.getError("请先登录用户!");
        }else{
            return null;
        }
    }
}
