package com.github.wblancqu.custody.domain;

import java.time.LocalDate;

public interface Rule {

    boolean isApplicableOn(LocalDate date);
    DaySchedule applyOn(DaySchedule daySchedule, LocalDate date);

}
