package com.mryao.gxkygl.user.dao;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.user.entity.Permission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/19 17:36
 * @Description:
 * @Version: 1.0
 */
public interface PermissionRepository extends BaseRepository<Permission> {

    @Query("select p from Permission p where (p.code = :code or p.name = :name) and p.parentId = :parentId")
    Permission saveValidate(@Param("name") String name,@Param("code") String code,@Param("parentId") String parentId);

    @Query("select count(p.id)  from Permission p where (p.code = :code or p.name = :name) and p.parentId = :parentId and p.id <> :id")
    int updateValidate(@Param("id") String id, @Param("name") String name,@Param("code") String code,@Param("parentId") String parentId);

}
