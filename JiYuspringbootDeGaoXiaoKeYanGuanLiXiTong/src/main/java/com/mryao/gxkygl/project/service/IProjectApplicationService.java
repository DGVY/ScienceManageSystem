package com.mryao.gxkygl.project.service;

import com.mryao.gxkygl.common.base.service.IBaseService;
import com.mryao.gxkygl.project.entity.ProjectApplication;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/10 18:20
 * @Description:
 * @Version: 1.0
 */
public interface IProjectApplicationService extends IBaseService<ProjectApplication>{
    /**
     * 项目申请
     * @param projectApplication
     * @return
     */
    ProjectApplication toApplication(ProjectApplication projectApplication);

    /**
     * 项目申请通过
     * @param projectApplication
     * @return
     */
    ProjectApplication applicationPass(ProjectApplication projectApplication);

    /**
     * 项目申请未通过
     * @param projectApplication
     * @return
     */
    ProjectApplication applicationNotPass(ProjectApplication projectApplication);
}
