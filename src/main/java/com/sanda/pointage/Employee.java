package com.sanda.pointage;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Employee(
    String nom,
    String prenoms,
    String cin,
    LocalDate dateDeNaissance,
    LocalDate dateEmbauche,
    LocalDate finContrat,
    BigDecimal salaire,
    Categorie categorie
) {}
