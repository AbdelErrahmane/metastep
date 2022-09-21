package com.example.metastep.business;

import com.example.metastep.model.Technologies;
import com.example.metastep.repository.TechnologyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologiesBusImp implements  TechnologiesBus{
    @Autowired
    TechnologyRepo technologyRepo;

    @Override
    public Technologies saveTechnologies(Technologies technology) {
        return technologyRepo.save(technology);
    }

    @Override
    public Technologies updateTechnologies(int id, Technologies technology) {
        technology.setTechnologyId(id);
        return technologyRepo.save(technology);
    }

    @Override
    public List<Technologies> getAllTechnologies() {
        return technologyRepo.findAll();
    }

    @Override
    public void delecteCat(int id) {
        technologyRepo.deleteById(id);

    }
}
