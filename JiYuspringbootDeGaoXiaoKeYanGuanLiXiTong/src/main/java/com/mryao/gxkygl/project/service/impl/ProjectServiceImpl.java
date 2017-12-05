package com.mryao.gxkygl.project.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.project.constant.ProjectStatus;
import com.mryao.gxkygl.project.dao.ProjectRepository;
import com.mryao.gxkygl.project.entity.Project;
import com.mryao.gxkygl.project.service.IProjectService;
import com.mryao.gxkygl.project.util.ProjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/25 10:07
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements IProjectService {
    public ProjectServiceImpl(BaseRepository<Project> repository) {
        super(repository);
    }

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private BaseRepository<Project> baseRepository;

    @Override
    public Project update(Project newProject, Project oldProject) {
        newProject = ProjectUtils.someThingNotChange(newProject,oldProject);
        Project updated = baseRepository.save(newProject);
        return updated;
    }

    @Override
    public Project changeStatus(String projectId, ProjectStatus status) {
        Project project = projectRepository.findOne(projectId);
        Assert.notNull(project,"项目"+project.getName()+"不存在!");
        project.setStatus(status.getCode());
        return baseRepository.save(project);
    }

    @Override
    public Project findByName(String name) {
        return projectRepository.findByName(name);
    }
}
