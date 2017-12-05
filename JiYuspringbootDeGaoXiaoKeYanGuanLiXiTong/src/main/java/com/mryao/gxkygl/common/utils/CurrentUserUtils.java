package com.mryao.gxkygl.common.utils;

import com.mryao.gxkygl.user.dto.LoginUserDto;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthenticatedException;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/20 14:03
 * @Description:
 * @Version: 1.0
 */
public class CurrentUserUtils {

    /**
     * 获取当前用户
     * @return
     */
    public static LoginUserDto getCurrentUser(){
        LoginUserDto loginUserDto = (LoginUserDto) SecurityUtils.getSubject().getPrincipal();
        if(loginUserDto == null){
            throw new UnauthenticatedException("请先登录用户!");
        }
        return loginUserDto;
    }

    /**
     * 登出
     */
    public static void loginOut(){
        SecurityUtils.getSubject().logout();
    }
}
