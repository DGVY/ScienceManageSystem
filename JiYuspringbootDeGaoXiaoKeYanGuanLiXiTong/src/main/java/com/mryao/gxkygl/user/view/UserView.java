package com.mryao.gxkygl.user.view;

import com.mryao.gxkygl.common.base.V;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/20 11:06
 * @Description: 用户视图对象
 * @Version: 1.0
 */
@ApiModel("用户视图")
public class UserView {

    public interface Login{}

    public interface UpdateStatus {}

    //id
    @ApiModelProperty("id")
    @NotBlank(groups = {V.Update.class},message = "id不能为空!")
    private String id;

    //用户名
    @ApiModelProperty("用户名")
    @Size(min = 5,max = 10,groups = {V.Save.class,V.Update.class,Login.class},message = "用户名[5-10]位!")
    @NotBlank(groups = {V.Save.class,V.Update.class,Login.class},message = "用户名不能为空!")
    private String userName;

    //密码
    @ApiModelProperty("密码")
    @Size(min = 5,max = 10,groups = {V.Save.class,Login.class},message = "密码[5-10]位!")
    @NotBlank(groups = {V.Save.class,Login.class},message = "密码不能为空!")
    private String password;

    //真实姓名
    @ApiModelProperty("真实姓名")
    private String realName;

    //电话
    @ApiModelProperty("电话")
    private String phone;

    //身份证
    @ApiModelProperty("身份证")
    private String card;

    //用户状态
    @ApiModelProperty("用户状态")
    @NotBlank(groups = {UpdateStatus.class},message = "请选择用户状态!")
    private String status;

    //用户类型
    //user是普通用户 admin 是超级管理员
    @ApiModelProperty("用户类型")
    private String type;

    //创建时间
    @ApiModelProperty("创建时间")
    private Date createTime;

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
