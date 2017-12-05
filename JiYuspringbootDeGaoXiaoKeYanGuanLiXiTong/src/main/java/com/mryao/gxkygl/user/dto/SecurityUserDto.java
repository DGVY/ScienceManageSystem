package com.mryao.gxkygl.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 16:40
 * @Description: 无敏感信息的userDto
 * @Version: 1.0
 */
public class SecurityUserDto implements Serializable{
    //id
    private String id;

    //用户名
    private String userName;

    //真实姓名
    private String realName;

    //电话
    private String phone;

    //用户状态
    private String status;

    //用户类型
    private String type;

    //创建时间
    private Date createTime;

    public SecurityUserDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
