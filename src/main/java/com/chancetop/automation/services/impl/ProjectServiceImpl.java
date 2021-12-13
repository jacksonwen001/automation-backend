package com.chancetop.automation.services.impl;

import com.chancetop.automation.examples.TProjectExample;
import com.chancetop.automation.mappers.TProjectMapper;
import com.chancetop.automation.models.TProject;
import com.chancetop.automation.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    TProjectMapper projectMapper;

    @Override
    public List<TProject> getAllProjects(int page, int pageSize) {
        return projectMapper.selectByExample(new TProjectExample().page(page, pageSize));
    }

    @Override
    public TProject getProjectById(long id) {
        return projectMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteProjectById(long id) {
        projectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateProject(TProject project) {
        projectMapper.updateByPrimaryKey(project);
    }

    @Override
    public void addProject(TProject project) {
        projectMapper.insert(project);
    }
}
