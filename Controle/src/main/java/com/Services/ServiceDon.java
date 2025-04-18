package com.Services;

import com.Repositories.CampagneRepository;
import com.Repositories.DonRepository;
import com.dto.DonDTO;
import com.entities.Campagne;
import com.entities.Don;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDon {
    @Autowired
    private DonRepository donRepo;
    @Autowired private CampagneRepository campagneRepo;

    public Don enregistrerDon(Long campagneId, DonDTO dto) {
        Campagne campagne = campagneRepo.findById(campagneId)
                .orElseThrow(() -> new RuntimeException("Campagne non trouvée"));

        Don don = new Don();
        don.setCampagne(campagne);
        don.setNomDonateur(dto.getNomDonateur());
        don.setMontant(dto.getMontant());
        don.setDate(dto.getDate());

        return donRepo.save(don);
    }
}
