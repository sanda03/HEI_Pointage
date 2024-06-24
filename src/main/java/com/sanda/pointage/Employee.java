package com.sanda.pointage;

import lombok.Data;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Employee{
    private String nom;
    private String prenoms;
    private String cin;
    private LocalDate dateDeNaissance;
    private LocalDate dateEmbauche;
    private LocalDate finContrat;
    private Categorie categorie;
    private Map<Month, List<Pointage>> pointages = new HashMap<>();

    public Employee(String nom, String prenoms, String cin,LocalDate finContrat,  LocalDate dateDeNaissance, LocalDate dateEmbauche, Categorie categorie) {
        this.finContrat = finContrat;
        this.nom = nom;
        this.prenoms = prenoms;
        this.cin = cin;
        this.dateDeNaissance = dateDeNaissance;
        this.dateEmbauche = dateEmbauche;
        this.categorie = categorie;
    }

    void addPointage(Month mois, Pointage pointage){
        var pointagesAvant = pointages.getOrDefault(mois, new ArrayList<>());
        pointagesAvant.add(pointage);
        pointages.put(mois, pointagesAvant);
    }
}