package com.example.metastep.business;

import com.example.metastep.model.Project;

import java.util.List;

public interface ProjectBus {
    public Project saveProject (Project project);
    public Project updateProject (int id, Project project);
    public List<Project> getAllProject();
    public void delecteCat(int id);
}
