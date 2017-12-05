package com.mryao.gxkygl.project.service;

import com.mryao.gxkygl.common.base.service.IBaseService;
import com.mryao.gxkygl.project.constant.ProjectStatus;
import com.mryao.gxkygl.project.entity.Project;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/25 9:42
 * @Description:
 * @Version: 1.0
 */
public interface IProjectService extends IBaseService<Project>{

    /**
     * 项目更新
     * @param newProject
     * @param oldProject
     * @return
     */
    Project update(Project newProject, Project oldProject);

    /**
     * 修改项目状态
     * @param projectId
     * @param status
     * @return
     */
    Project changeStatus(String projectId, ProjectStatus status);

    /**
     * 根据项目名称查询
     * @param name
     * @return
     */
    Project findByName(String name);
}
