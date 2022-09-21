package com.example.metastep.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Technologies implements Serializable {

    @Id
    private int technologyId;
    private String technologyLabel;
    @ManyToMany
    @JoinTable(name="project_techno", joinColumns = {@JoinColumn(name = "technologyId")},
            inverseJoinColumns = {@JoinColumn(name = "projectId")})
    private Collection<Project> projects;


    public void setTechnologyId(int technologyId) {
        this.technologyId = technologyId;
    }


}
