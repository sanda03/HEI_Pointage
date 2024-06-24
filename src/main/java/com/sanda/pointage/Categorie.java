package com.sanda.pointage;

import java.math.BigDecimal;
import java.time.DayOfWeek;

public record Categorie(
    CategoryType type,
    int heureNormal,
    BigDecimal salaireParSemaine,
    double indemnite,
    DayOfWeek debut,
    DayOfWeek fin
){}