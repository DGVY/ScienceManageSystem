package com.mryao.gxkygl.user.entity;

import com.mryao.gxkygl.common.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 15:27
 * @Description:
 * @Version: 1.0
 */
@Entity(name = "UserRole")
@Table(name = BaseEntity.TABLE_PREFIX + "USER_ROLE")
public class UserRole extends BaseEntity {

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String roleId;

    public UserRole() {
    }

    public UserRole(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public static List<UserRole> getUserRoleList(String userId, String[] roleIds ){
        List<UserRole> userRoles = new ArrayList<>();
        for(String roleId:roleIds){
            userRoles.add(new UserRole(userId,roleId));
        }
        return userRoles;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
