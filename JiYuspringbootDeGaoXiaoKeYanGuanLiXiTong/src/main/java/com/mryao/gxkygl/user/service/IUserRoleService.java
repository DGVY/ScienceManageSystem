package com.mryao.gxkygl.user.service;

import com.mryao.gxkygl.common.base.service.IBaseService;
import com.mryao.gxkygl.user.entity.UserRole;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/7 14:10
 * @Description:
 * @Version: 1.0
 */
public interface IUserRoleService extends IBaseService<UserRole>{
    /**
     * 根据用户id获取角色ids
     * @param id
     * @return
     */
    Set<String> findRoleIdsByUserId(String id);

}
