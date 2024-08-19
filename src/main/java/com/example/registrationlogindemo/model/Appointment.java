package com.example.registrationlogindemo.model;

import com.example.registrationlogindemo.entity.User;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column
    private String status; // one of "pending", "cancelled", "done"

    // manye-to-one relationship (many appointments can take place in a centre)
    @ManyToOne
    private VaccineCentre vaccineCentre;

    // Bidirectional many-to-one relationship (A user may have multiple vaccine
    // appointments)
    @ManyToOne
    private User user;

    public Appointment() {
    }

    public Appointment(VaccineCentre vaccineCentre, LocalDate date, LocalTime time, User user, String status) {
        this.vaccineCentre = vaccineCentre;
        this.date = date;
        this.time = time;
        this.user = user;
        this.status = status;
    }

}
