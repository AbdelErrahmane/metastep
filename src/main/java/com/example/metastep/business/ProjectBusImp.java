package com.example.metastep.business;

import com.example.metastep.model.Project;
import com.example.metastep.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectBusImp implements ProjectBus{
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(int id, Project project) {
        project.setProjectId(id);
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public void delecteCat(int id) {
        projectRepository.deleteById(id);
    }
}
