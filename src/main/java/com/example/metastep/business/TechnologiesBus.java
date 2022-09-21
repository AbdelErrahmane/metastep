package com.example.metastep.business;

import com.example.metastep.model.Technologies;

import java.util.List;

public interface TechnologiesBus {
    public Technologies saveTechnologies (Technologies technology);
    public Technologies updateTechnologies (int id, Technologies technology);
    public List<Technologies> getAllTechnologies();
    public void delecteCat(int id);
}
