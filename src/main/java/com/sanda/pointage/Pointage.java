package com.sanda.pointage;

import java.time.LocalTime;

public record Pointage(Employee person, LocalTime debut, LocalTime fin) {}