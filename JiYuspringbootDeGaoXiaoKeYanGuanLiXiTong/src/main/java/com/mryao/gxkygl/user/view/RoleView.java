package com.mryao.gxkygl.user.view;


import com.mryao.gxkygl.common.base.V;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * @author zhouyang
 * @Date 2017-04-12 下午1:10
 * @Description 角色视图
 * @Version 1.0
 */
public class RoleView {

    @ApiModelProperty("id")
    @NotBlank(groups = {V.Update.class},message = "请设置你要修改角色Id!")
    private String id;

    @ApiModelProperty("角色名称")
    @Size(min = 2,max = 20,groups = {V.Save.class,V.Update.class},message = "角色名称[2-20]位!")
    @NotBlank(groups = {V.Save.class,V.Update.class},message = "角色名称不能为空!")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
