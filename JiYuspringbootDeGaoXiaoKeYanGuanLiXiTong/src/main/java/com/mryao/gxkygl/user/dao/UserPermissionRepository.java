package com.mryao.gxkygl.user.dao;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.user.entity.UserPermission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 17:43
 * @Description:
 * @Version: 1.0
 */
public interface UserPermissionRepository extends BaseRepository<UserPermission> {
}
