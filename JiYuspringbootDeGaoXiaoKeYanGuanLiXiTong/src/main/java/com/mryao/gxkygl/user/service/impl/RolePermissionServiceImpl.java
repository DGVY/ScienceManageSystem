package com.mryao.gxkygl.user.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.user.entity.RolePermission;
import com.mryao.gxkygl.user.service.IRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/7 14:13
 * @Description:
 * @Version: 1.0
 */
@Service
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermission> implements IRolePermissionService {

    public RolePermissionServiceImpl(BaseRepository<RolePermission> repository) {
        super(repository);
    }
}
