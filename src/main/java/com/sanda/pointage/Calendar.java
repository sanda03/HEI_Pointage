package com.sanda.pointage;

import lombok.Data;

import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

@Data
public class Calendar{
    private final Month mois;
    private final List<MonthDay> jourFeriee = new ArrayList<>();

    public Calendar(Month mois, List<Integer> jourFeriees) {
        this.mois = mois;
        var jourFeriee = jourFeriees.stream().map(jour -> MonthDay.of(mois, jour)).toList();
        this.jourFeriee.addAll(jourFeriee);
    }
}