package com.example.demo.tp_crud.service;

import com.example.demo.tp_crud.models.Voiture;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;

@ApplicationScoped
public class VoitureService {
    public Voiture save(int id, String marque, LocalDate constructDate, String color) {
        return new Voiture(id, marque, constructDate, color);
    }
}
