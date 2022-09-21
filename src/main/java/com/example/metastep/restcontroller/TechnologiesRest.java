package com.example.metastep.restcontroller;

import com.example.metastep.business.TechnologiesBus;
import com.example.metastep.model.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "technology")
public class TechnologiesRest {

    @Autowired
    private TechnologiesBus technologiesBus;


    @PostMapping(value = "new")
    public Technologies save(Technologies technology){
        return technologiesBus.saveTechnologies(technology);
    }

    @PostMapping(value = "update")
    public  Technologies update(int id, Technologies technology){
        return technologiesBus.updateTechnologies(id, technology);
    }

    @PostMapping(value = "new")
    public  void delete(int id){
        technologiesBus.delecteCat(id);
    }

    @PostMapping(value = "new")
    public List<Technologies> getList(){
        return technologiesBus.getAllTechnologies();
    }
}
