package Menstrual_Flow;

import java.time.LocalDate;

public class MenstrualApp {
    public static LocalDate calculatePeriod(LocalDate lastPeriodDate, int cycleLength){
        return lastPeriodDate.plusDays(cycleLength);
    }
}
