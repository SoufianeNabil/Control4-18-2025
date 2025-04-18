package com.controllers;

import com.Services.ServiceDon;
import com.dto.DonDTO;
import com.entities.Don;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/campagnes")
public class DonController {
    @Autowired
    private ServiceDon service;

    @PostMapping("/{id}/dons")
    public ResponseEntity<?> ajouterDon(@PathVariable Long id, @RequestBody @Valid DonDTO don) {
        Don saved = service.enregistrerDon(id, don);
        return ResponseEntity.ok(saved);
    }
}
