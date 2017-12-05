package com.mryao.gxkygl.common.exception;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 17:17
 * @Description: 拷贝失败异常
 * @Version: 1.0
 */
public class CopyFailedException extends RuntimeException{
    public CopyFailedException(String msg){
        super("对象拷贝失败!" + msg);
    }
}
