package com.example.metastep.restcontroller;

import com.example.metastep.business.ProjectBus;
import com.example.metastep.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "project")
public class ProjectRest {
    @Autowired
    ProjectBus projectBus;

    @PostMapping(value = "new")
    public  Project save(Project project){
        return projectBus.saveProject(project);
    }

    @PostMapping(value = "update")
    public  Project update(int id, Project project){
        return projectBus.updateProject(id, project);
    }

    @PostMapping(value = "delete")
    public  void delete(int id){
         projectBus.delecteCat(id);
    }

    @PostMapping(value = "get")
    public List<Project> getList(){
        return projectBus.getAllProject();
    }

}
