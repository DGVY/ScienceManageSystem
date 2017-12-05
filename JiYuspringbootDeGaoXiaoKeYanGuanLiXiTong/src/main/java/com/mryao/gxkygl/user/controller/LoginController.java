package com.mryao.gxkygl.user.controller;

import com.mryao.gxkygl.common.aop.AutoErrorhandler;
import com.mryao.gxkygl.common.constant.ShiroConstant;
import com.mryao.gxkygl.common.context.ContextUtils;
import com.mryao.gxkygl.common.result.Result;
import com.mryao.gxkygl.common.utils.CurrentUserUtils;
import com.mryao.gxkygl.common.utils.LoginUtils;
import com.mryao.gxkygl.user.entity.User;
import com.mryao.gxkygl.user.service.IUserService;
import com.mryao.gxkygl.user.view.UserView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/20 9:50
 * @Description:
 * @Version: 1.0
 */
@Api("登录管理")
@RestController
public class LoginController {

    @Autowired
    private IUserService userService;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation("用户登录")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @AutoErrorhandler
    public Result login(@RequestBody @Validated(UserView.Login.class) UserView userView, BindingResult bindingResult)throws Exception{
        User loginUser = userService.findByUserName(userView.getUserName());
        Assert.notNull(loginUser,"用户不存在!");
        Result result = LoginUtils.login(userView.getUserName(), userView.getPassword());
        if(result.isSuccess()){
            Session session = SecurityUtils.getSubject().getSession();
            Cookie cookie = new Cookie(ShiroConstant.SESSION_TOKEN_KEY, session.getId().toString());
            cookie.setPath("/");
            ContextUtils.getResponse().addCookie(cookie);
            result.setData(session.getId());
        }
        return result;
    }

    @ApiOperation(value="告诉前端让用户跳转到登录页面")
    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    @AutoErrorhandler
    public Result toLogin(HttpServletResponse response) throws ServletException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        Result result = Result.getError("请你先登录你的用户!");
        return result;
    }

    @ApiOperation(value="登出")
    @GetMapping(value = "/loginOut")
    @AutoErrorhandler
    public Result logOut(){
        CurrentUserUtils.loginOut();
        return Result.getSuccess("登出成功!");
    }


}
