package com.sanda.pointage;

import lombok.Data;

import java.time.LocalTime;
import java.time.Month;

@Data
public class Pointage{
    private Employee person;
    private LocalTime debut;
    private LocalTime fin;

    public Pointage(Month mois, Employee person, LocalTime debut, LocalTime fin) {
        this.person = person;
        this.debut = debut;
        this.fin = fin;
        this.person.addPointage(mois, this);
    }
}