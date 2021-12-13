package com.chancetop.automation.controller;

import com.chancetop.automation.models.TProject;
import com.chancetop.automation.services.ProjectService;
import org.apache.ibatis.annotations.DeleteProvider;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
    @Resource
    ProjectService projectService;

    @GetMapping("/projects")
    public List<TProject> getAllProjects(int page, int pageSize){
        return projectService.getAllProjects(page, pageSize);
    }

    @GetMapping("/project")
    public TProject getProjectById(long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/project")
    public void addProject(@RequestBody  TProject project) {
        projectService.addProject(project);
    }

    @DeleteMapping("/project")
    public void deleteProjectById(long id) {
        projectService.deleteProjectById(id);
    }

    @PutMapping("/project")
    public void updateProject(@RequestBody  TProject project) {
        projectService.updateProject(project);
    }
}
