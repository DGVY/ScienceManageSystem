package com.mryao.gxkygl.common.exception;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 17:12
 * @Description: 没有找到异常
 * @Version: 1.0
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException(String msg){
        super(msg);
    }
}
