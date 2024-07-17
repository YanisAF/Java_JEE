package com.example.demo.exercice5.model;

import jakarta.persistence.*;
import java.time.LocalDate;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String race;

//    @Temporal(TemporalType.DATE) ne sauvegarde que le jour, le mois et l'année
    private LocalDate dateOfBirth;

    public Dog(int id, String name, String race, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.dateOfBirth = dateOfBirth;
    }

    public Dog() {

    }

    public Dog(String name, String race, LocalDate dateOfBirth) {
        this.name = name;
        this.race = race;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
