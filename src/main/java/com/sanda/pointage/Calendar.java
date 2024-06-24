package com.sanda.pointage;

import java.time.MonthDay;
import java.util.List;

public record Calendar(
    MonthDay debut,
    MonthDay fin,
    List<MonthDay> jourFeriee
){}