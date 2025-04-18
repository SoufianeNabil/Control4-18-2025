package com.Repositories;

import com.entities.Campagne;
import com.projections.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface CampagneRepository extends JpaRepository<Campagne, Long>{
    List<CampagneResume> findByDateFinAfter(LocalDate now);
}
