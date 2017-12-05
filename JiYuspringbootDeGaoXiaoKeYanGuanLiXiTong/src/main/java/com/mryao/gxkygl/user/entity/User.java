package com.mryao.gxkygl.user.entity;

import com.mryao.gxkygl.common.base.entity.BaseEntity;
import com.mryao.gxkygl.common.constant.UserType;
import com.mryao.gxkygl.common.exception.CopyFailedException;
import com.mryao.gxkygl.common.utils.BeanCopyUtils;
import com.mryao.gxkygl.user.dto.SecurityUserDto;
import com.mryao.gxkygl.user.view.UserView;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 14:23
 * @Description:
 * @Version: 1.0
 */
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "USER")
public class User extends BaseEntity{

    //用户名
    @Column(name = "name",length = 50,nullable = false,unique = true)
    private String userName;

    //密码
    @Column(name = "password",length = 100,nullable = false)
    private String password;

    //真实姓名
    @Column(name = "realname",length = 50,nullable = true)
    private String realName;

    //电话
    @Column(name = "phone",length = 11,nullable = true)
    private String phone;

    //身份证
    @Column(name = "card",length = 18,nullable = true)
    private String card;

    //用户状态
    //status是oracle关键词
    @Column(name = "state",nullable = false)
    private String status;

    //所属学院
    @Column(name = "college")
    private String college;

    //加盐
    @Column(name = "salt",nullable = false)
    private String salt;

    //用户类型
    //user是普通用户 admin 是超级管理员
    @Column(name = "type",nullable = false)
    private String type;

    //创建时间
    @Column(name = "create_time",nullable = false)
    private Date createTime;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public SecurityUserDto toSecurityUserDto(User user){
        SecurityUserDto userDto ;
        try {
            userDto = BeanCopyUtils.copy(user,SecurityUserDto.class);
        } catch (Exception e) {
            throw new CopyFailedException(e.getMessage());
        }
        return userDto;
    }

    public UserView toUserView(User user){
        UserView userView ;
        try {
            userView = BeanCopyUtils.copy(user,UserView.class);
            userView.getType();
            UserType.valueOf("admin");
        } catch (Exception e) {
            throw new CopyFailedException(e.getMessage());
        }
        return userView;
    }
}
