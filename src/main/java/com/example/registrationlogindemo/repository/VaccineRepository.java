package com.example.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.registrationlogindemo.model.Vaccine;

import java.util.List;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Integer> {
    @Query(value = "SELECT * FROM vaccine WHERE user_id=:userId", nativeQuery = true)
    List<Vaccine> findByUser(Integer userId);
}
