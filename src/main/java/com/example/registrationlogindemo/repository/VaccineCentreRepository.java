package com.example.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.registrationlogindemo.model.VaccineCentre;

@Repository
public interface VaccineCentreRepository extends JpaRepository<VaccineCentre, Integer> {
    
}
