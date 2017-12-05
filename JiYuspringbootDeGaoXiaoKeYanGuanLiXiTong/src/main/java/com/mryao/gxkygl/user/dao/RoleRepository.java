package com.mryao.gxkygl.user.dao;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.user.entity.Role;
import org.springframework.data.repository.query.Param;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/7 14:47
 * @Description:
 * @Version: 1.0
 */
public interface RoleRepository extends BaseRepository<Role> {
    /**
     * 根据角色名获取角色
     * @param name
     * @return
     */
    Role findByName(@Param("name") String name);
}
