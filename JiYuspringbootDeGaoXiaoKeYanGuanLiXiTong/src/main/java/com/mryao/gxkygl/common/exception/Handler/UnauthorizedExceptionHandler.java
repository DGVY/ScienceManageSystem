package com.mryao.gxkygl.common.exception.Handler;

import com.mryao.gxkygl.common.result.Result;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;


/**
 * @author zhouyang
 * @Date 2017-04-14 上午11:33
 * @Description 没有权限异常处理
 * @Version 1.0
 */
@Component
public class UnauthorizedExceptionHandler implements ExceptionHandler {
    public Object handler(HttpServletResponse response, Throwable e) {
        if(e instanceof UnauthorizedException){
            return Result.getError("你没有权限访问此页面!");
        }else{
            return null;
        }
    }
}
