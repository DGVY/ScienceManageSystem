package com.mryao.gxkygl.common.utils;

import java.util.UUID;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/15 17:25
 * @Description:
 * @Version: 1.0
 */
public class UUIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","").toString();
    }

}
