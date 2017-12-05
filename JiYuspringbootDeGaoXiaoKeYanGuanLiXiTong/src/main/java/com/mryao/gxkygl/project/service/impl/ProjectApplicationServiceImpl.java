package com.mryao.gxkygl.project.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.common.utils.CurrentUserUtils;
import com.mryao.gxkygl.project.constant.ApplicationStatus;
import com.mryao.gxkygl.project.constant.ProjectStatus;
import com.mryao.gxkygl.project.dao.ProjectApplicationRepository;
import com.mryao.gxkygl.project.entity.ProjectApplication;
import com.mryao.gxkygl.project.service.IProjectApplicationService;
import com.mryao.gxkygl.project.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/10 18:21
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProjectApplicationServiceImpl extends BaseServiceImpl<ProjectApplication> implements IProjectApplicationService {

    public ProjectApplicationServiceImpl(BaseRepository<ProjectApplication> repository) {
        super(repository);
    }

    @Autowired
    private ProjectApplicationRepository projectApplicationRepository;

    @Autowired
    private IProjectService projectService;

    @Override
    @Transactional
    public ProjectApplication toApplication(ProjectApplication projectApplication) {
        projectApplication.setStatus(ApplicationStatus.ON_APPLIACTION.getName());
        projectApplication.setApplicant(CurrentUserUtils.getCurrentUser().getSecurityUserDto().getUserName());
        projectApplication.setApplicateTime(new Date());
        ProjectApplication savedPorjectAppication = projectApplicationRepository.save(projectApplication);
        //项目申报中  项目申报 不可修改 不可申报 不可以申请变更 不可结题
        projectService.changeStatus(projectApplication.getProjectId(), ProjectStatus.PROJECT_AUDIT);
        return savedPorjectAppication;
    }

    @Override
    @Transactional
    public ProjectApplication applicationPass(ProjectApplication projectApplication) {
        projectApplication.setStatus(ApplicationStatus.SUCCESS_APPLICATION.getName());
        ProjectApplication updatedProjectApplication = projectApplicationRepository.save(projectApplication);
        //未结题 结题之前的状态 不可修改 不可以申报 可以申请变更 可以申请结题
        projectService.changeStatus(projectApplication.getProjectId(),ProjectStatus.NOT_CONCLUSION);
        return updatedProjectApplication;
    }

    @Override

    public ProjectApplication applicationNotPass(ProjectApplication projectApplication) {
        projectApplication.setStatus(ApplicationStatus.FAIL_APPLICATION.getName());
        ProjectApplication updatedProjectApplication = projectApplicationRepository.save(projectApplication);
        //申报失败 等同草稿 可以修改 可以申报 不可以申请变更 不可以结题
        projectService.changeStatus(projectApplication.getProjectId(),ProjectStatus.FAIL_PROJECT_AUDIT);
        return updatedProjectApplication;
    }
}
