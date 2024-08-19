package com.example.registrationlogindemo.repository;


import com.example.registrationlogindemo.model.AppointmentSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface AppointmentSlotRepository extends JpaRepository<AppointmentSlot, Integer> {
    @Query(value = "SELECT * FROM appointment_slot WHERE vaccine_centre_id=:centreId AND date=:startDate AND start_time=:startTime", nativeQuery = true)
    AppointmentSlot findByDetails(Integer centreId, LocalDate startDate, LocalTime startTime);
}