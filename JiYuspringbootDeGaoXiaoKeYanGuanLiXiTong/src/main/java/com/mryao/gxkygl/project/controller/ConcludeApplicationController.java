package com.mryao.gxkygl.project.controller;

import com.mryao.gxkygl.common.aop.AutoErrorhandler;
import com.mryao.gxkygl.common.base.V;
import com.mryao.gxkygl.common.query.Query;
import com.mryao.gxkygl.common.result.PageResult;
import com.mryao.gxkygl.common.result.Result;
import com.mryao.gxkygl.common.utils.BeanCopyUtils;
import com.mryao.gxkygl.project.entity.ConcludeApplication;
import com.mryao.gxkygl.project.query.ApplicationQuery;
import com.mryao.gxkygl.project.service.IConcludeApplicationService;
import com.mryao.gxkygl.project.view.ConcludeApplicationView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/2 10:58
 * @Description: 结题申请
 * @Version: 1.0
 */
@Api("结题申请")
@RestController
@RequestMapping(value = "conclude_application")
public class ConcludeApplicationController {

    @Autowired
    private IConcludeApplicationService concludeApplicationService;

    @ApiOperation("结题申请")
    @PostMapping("")
    @AutoErrorhandler
    public Result save(@RequestBody @Validated(V.Save.class) ConcludeApplicationView concludeApplicationView, BindingResult bindingResult)throws Exception{
        ConcludeApplication concludeApplication = BeanCopyUtils.copy(concludeApplicationView, ConcludeApplication.class);
        return Result.getSuccess(concludeApplicationService.toApplication(concludeApplication));
    }


    @ApiOperation(value = "结题申请通过")
    @PutMapping(value = "/pass")
    @AutoErrorhandler
    public Result applicationPass(@RequestBody @Validated(ConcludeApplicationView.ApplicationPass.class) ConcludeApplicationView concludeApplicationView, BindingResult bindingResult){
        ConcludeApplication concludeApplication = concludeApplicationService.findById(concludeApplicationView.getId());
        Assert.notNull(concludeApplication,"结题申请不存在!");
        concludeApplication.setBackInformation(concludeApplicationView.getBackInformation());
        return Result.getSuccess(concludeApplicationService.applicationPass(concludeApplication));
    }

    @ApiOperation(value = "结题申请未通过")
    @PutMapping(value = "/not_pass")
    @AutoErrorhandler
    public Result applicationNotPass(@RequestBody @Validated(ConcludeApplicationView.ApplicationNotPass.class) ConcludeApplicationView concludeApplicationView, BindingResult bindingResult){
        ConcludeApplication concludeApplication = concludeApplicationService.findById(concludeApplicationView.getId());
        Assert.notNull(concludeApplication,"结题申请不存在!");
        concludeApplication.setBackInformation(concludeApplicationView.getBackInformation());
        return Result.getSuccess(concludeApplicationService.applicationNotPass(concludeApplication));
    }

    @ApiOperation(value = "查询结题申请")
    @GetMapping("/query")
    @AutoErrorhandler
    public Result query(ApplicationQuery query){
        PageResult pageResult = concludeApplicationService.queryPage(query);
        return Result.getSuccess(pageResult);
    }

    @ApiOperation(value = "根据id获取结题申请")
    @GetMapping(value = "",params = {"id"})
    @AutoErrorhandler
    public Result findById(String id){
        ConcludeApplication concludeApplication = concludeApplicationService.findById(id);
        Assert.notNull(concludeApplication,"结题申请不能为空!");
        return Result.getSuccess(concludeApplication);
    }
}
