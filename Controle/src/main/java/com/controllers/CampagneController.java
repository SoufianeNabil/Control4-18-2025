package com.controllers;

import com.Services.ServiceCampagne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projections.CampagneResume;

import java.util.List;

@RestController
@RequestMapping("/api/campagnes")
public class CampagneController {
    @Autowired
    private ServiceCampagne service;

    @GetMapping("/actives")
    public List<CampagneResume> getActives() {
        return service.getCampagnesActives();
    }
}
