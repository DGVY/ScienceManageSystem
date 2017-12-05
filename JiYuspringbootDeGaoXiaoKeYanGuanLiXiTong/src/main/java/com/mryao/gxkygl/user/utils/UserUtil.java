package com.mryao.gxkygl.user.utils;

import com.mryao.gxkygl.user.entity.User;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/25 15:58
 * @Description: 用户工具
 * @Version: 1.0
 */
public class UserUtil {
    /**
     * 用户更新属性设置
     * @param newUser
     * @param oldUser
     * @return
     */
    public static User updateUser(User newUser,User oldUser){
        oldUser.setCard(newUser.getCard());
        oldUser.setCollege(newUser.getCollege());
        oldUser.setPhone(newUser.getPhone());
        oldUser.setRealName(newUser.getRealName());
        return oldUser;
    }
}
