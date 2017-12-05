package com.mryao.gxkygl.common.exception.Handler;

import javax.servlet.http.HttpServletResponse;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/15 21:58
 * @Description: 异常处理
 * @Version: 1.0
 */
public interface ExceptionHandler {

    public Object handler(HttpServletResponse response, Throwable e);


}
