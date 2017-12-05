package com.mryao.gxkygl.common.constant;


import com.mryao.gxkygl.project.constant.ProjectStatus;

/**
 * @author zhouyang
 * @Date 2017-03-08 下午4:38
 * @Description 用户状态
 * @Version 1.0
 */
public enum UserStatus {
    //用户被禁用
    LOCK("0","禁用"),
    //用户启用
    UNLOCK("1","启用");

    private String name;

    private String code;

    UserStatus(String code, String name) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
