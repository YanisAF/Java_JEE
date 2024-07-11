package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

public class Cat {
    String name;
    String race;
    String favouriteFood;
    LocalDate birthDate;

    public Cat(String name, String race, String favouriteFood, LocalDate birthDate) {
        this.name = name;
        this.race = race;
        this.favouriteFood = favouriteFood;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
