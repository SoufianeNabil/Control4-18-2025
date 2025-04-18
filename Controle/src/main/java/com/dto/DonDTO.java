package com.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DonDTO {
    private Long id;
    private String nomCampagne;
    @NotBlank
    private String nomDonateur;
    @DecimalMin("0.01")
    private BigDecimal montant;
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public String getNomCampagne() {
        return nomCampagne;
    }

    public String getNomDonateur() {
        return nomDonateur;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomCampagne(String nomCampagne) {
        this.nomCampagne = nomCampagne;
    }

    public void setNomDonateur(String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }




}
