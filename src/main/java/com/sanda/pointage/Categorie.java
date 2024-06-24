package com.sanda.pointage;

import java.math.BigDecimal;

public record Categorie(
    CategoryType type,
    int heureNormal,
    BigDecimal salaireParSemaine
){}