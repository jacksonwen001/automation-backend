package com.chancetop.automation.services;

import com.chancetop.automation.models.TProject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProjectService {
    List<TProject> getAllProjects(int page, int pageSize);
    TProject getProjectById(long id);
    void deleteProjectById(long id);
    void updateProject(TProject project);
    void addProject(TProject project);
}
