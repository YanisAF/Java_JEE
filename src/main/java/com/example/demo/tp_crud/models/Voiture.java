package com.example.demo.tp_crud.models;

import java.time.LocalDate;

public class Voiture {
    private int id;
    private String marque;
    private LocalDate constructDate;
    private String color;

    public Voiture(int id, String marque, LocalDate constructDate, String color) {
        this.id = id;
        this.marque = marque;
        this.constructDate = constructDate;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public LocalDate getConstructDate() {
        return constructDate;
    }

    public void setConstructDate(LocalDate constructDate) {
        this.constructDate = constructDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
