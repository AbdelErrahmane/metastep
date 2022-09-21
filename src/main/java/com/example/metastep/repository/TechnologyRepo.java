package com.example.metastep.repository;

import com.example.metastep.model.Technologies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepo extends JpaRepository<Technologies, Integer> {
}
