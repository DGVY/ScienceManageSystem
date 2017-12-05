package com.mryao.gxkygl.project.dao;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.project.entity.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/25 10:09
 * @Description:
 * @Version: 1.0
 */
public interface ProjectRepository extends BaseRepository<Project>{
    @Query("select p from Project p where p.name = :name")
    Project findByName(@Param("name") String name);
}
