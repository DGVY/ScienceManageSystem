package com.mryao.gxkygl.user.view;

import com.mryao.gxkygl.common.utils.tree.JsonTreeData;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/14 19:48
 * @Description:
 * @Version: 1.0
 */
public class AssignmentPermissionView {
    @ApiModelProperty("所有权限")
    private List<JsonTreeData> permissionTree  = new ArrayList<>();

    @ApiModelProperty("角色已经有了的权限")
    private Set<String> rolePermissionIds;

    public AssignmentPermissionView(List<JsonTreeData> permissionTree, Set<String> rolePermissionIds) {
        this.permissionTree = permissionTree;
        this.rolePermissionIds = rolePermissionIds;
    }

    public List<JsonTreeData> getPermissionTree() {
        return permissionTree;
    }

    public void setPermissionTree(List<JsonTreeData> permissionTree) {
        this.permissionTree = permissionTree;
    }

    public Set<String> getRolePermissionIds() {
        return rolePermissionIds;
    }

    public void setRolePermissionIds(Set<String> rolePermissionIds) {
        this.rolePermissionIds = rolePermissionIds;
    }
}
