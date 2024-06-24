package com.sanda.pointage;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
public class Employee{
    private String nom;
    private String prenoms,;
    private String cin;
    private LocalDate dateDeNaissance;
    private LocalDate dateEmbauche;
    private LocalDate finContrat;
    private Categorie categorie;
    public BigDecimal getSalaire(){
        return BigDecimal.TEN;
    }
}