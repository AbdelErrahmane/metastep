package com.example.metastep.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Project implements Serializable {

    @Id
    private int projectId;
    private String projectLabel;
    private int projectDescription;

    @ManyToMany
    @JoinTable(name="project_techno", joinColumns = {@JoinColumn(name = "projectId")},
    inverseJoinColumns = {@JoinColumn(name = "technologyId")})
    private Collection<Technologies> technologies;


    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


}
