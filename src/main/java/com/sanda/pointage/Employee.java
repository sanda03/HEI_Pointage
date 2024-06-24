package com.sanda.pointage;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee{
    private String nom;
    private String prenoms;
    private String cin;
    private LocalDate dateDeNaissance;
    private LocalDate dateEmbauche;
    private LocalDate finContrat;
    private Categorie categorie;
    private Map<Month, List<Pointage>> pointages = new HashMap<>();

    public Employee(LocalDate finContrat, String nom, String prenoms, String cin, LocalDate dateDeNaissance, LocalDate dateEmbauche, Categorie categorie) {
        this.finContrat = finContrat;
        this.nom = nom;
        this.prenoms = prenoms;
        this.cin = cin;
        this.dateDeNaissance = dateDeNaissance;
        this.dateEmbauche = dateEmbauche;
        this.categorie = categorie;
    }

    public BigDecimal getSalaire(Month mois){
        var pointageDuMois = pointages
            .entrySet()
            .stream()
            .filter(pointage -> pointage.getKey().equals(mois))
            .map(pointage -> pointage.getValue())
            .reduce(new ArrayList<>(),  (acc, pointage) -> {
                acc.addAll(pointage);
                return acc;
            });


    }

    void addPointage(Month mois, Pointage pointage){
        var pointagesAvant = pointages.getOrDefault(mois, new ArrayList<>());
        pointagesAvant.add(pointage);
        pointages.put(mois, pointagesAvant);
    }
}