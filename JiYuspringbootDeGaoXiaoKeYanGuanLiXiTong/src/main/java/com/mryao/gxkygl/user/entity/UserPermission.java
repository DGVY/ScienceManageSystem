package com.mryao.gxkygl.user.entity;

import com.mryao.gxkygl.common.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 17:39
 * @Description:
 * @Version: 1.0
 */
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "USER_PERMISSION")
public class UserPermission extends BaseEntity {


    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String permissionId;

    public UserPermission() {
    }

    public UserPermission(String userId, String permissionId) {
        this.userId = userId;
        this.permissionId = permissionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
}
