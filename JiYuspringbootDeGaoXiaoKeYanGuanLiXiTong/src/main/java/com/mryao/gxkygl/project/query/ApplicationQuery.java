package com.mryao.gxkygl.project.query;

import com.mryao.gxkygl.common.constant.UserType;
import com.mryao.gxkygl.common.query.Filter;
import com.mryao.gxkygl.common.query.Query;
import com.mryao.gxkygl.common.utils.CurrentUserUtils;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/19 19:29
 * @Description:
 * @Version: 1.0
 */
public class ApplicationQuery extends Query{
    @Override
    public void generateCondition() {
        //如果不是超级管理员 就不能看见所有人的申请
        if(!UserType.isAdmin(CurrentUserUtils.getCurrentUser().getSecurityUserDto().getType())){
            addFilter(new Filter("applicant", Filter.Operator.eq, CurrentUserUtils.getCurrentUser().getSecurityUserDto().getUserName()));

        }
    }
}
