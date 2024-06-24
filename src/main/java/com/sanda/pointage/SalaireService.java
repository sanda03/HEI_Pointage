package com.sanda.pointage;

import java.math.BigDecimal;
import java.time.Duration;

public record SalaireService {
    private static final int MAX_HEURE_SUP = 20;
    public static BigDecimal getSalaire(Calendar calendrier, Employee person){
        var numberOfWeeks = Duration.between(calendrier.debut(), calendrier.fin()).toDays();
    }
}