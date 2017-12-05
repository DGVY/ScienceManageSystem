package com.mryao.gxkygl.common.aop;

import java.lang.annotation.*;

/**
 * @author zhouyang
 * @Date 2017-04-13 下午2:31
 * @Description 自动处理controller Exception
 * @Version 1.0
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoErrorhandler {

}
