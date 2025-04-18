package com.Services;

import com.Repositories.CampagneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projections.CampagneResume;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceCampagne {
    @Autowired
    private CampagneRepository repo;

    public List<CampagneResume> getCampagnesActives() {
        return repo.findByDateFinAfter(LocalDate.now());
    }
}
