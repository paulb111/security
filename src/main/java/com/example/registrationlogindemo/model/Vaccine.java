package com.example.registrationlogindemo.model;

import com.example.registrationlogindemo.entity.User;
import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class Vaccine {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    @Setter
    @ManyToOne
    private User user;

    @Setter
    @ManyToOne
    private User admin;

    @Setter
    @Column(name = "date_received")
    private LocalDate dateReceived;

    @Setter
    @ManyToOne
    private VaccineCentre vaccineCentre;

    @Setter
    @Column()
    private String type;

    public Vaccine() {
    }

    public Vaccine(User admin, LocalDate dateReceived, VaccineCentre vaccineCentre, User user, String type) {
        this.admin = admin;
        this.dateReceived = dateReceived;
        this.vaccineCentre = vaccineCentre;
        this.user = user;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public User getAdmin() {
        return admin;
    }

    public VaccineCentre getVaccineCentre() {
        return vaccineCentre;
    }

    public LocalDate getDateReceived() {
        return dateReceived;
    }

    public User getUser() {
        return user;
    }

    public String getType() {
        return type;
    }


}
