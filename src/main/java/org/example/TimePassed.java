package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimePassed {
    public static void main(String[] args) {
        LocalDateTime targetDate = LocalDateTime.of(2026, 1, 8, 17, 34, 0);
        LocalDateTime today = LocalDateTime.now();

        Duration duration = Duration.between(today, targetDate);

        long totalDays = Math.abs(duration.toDays());
        int hours = Math.abs(duration.toHoursPart());
        int minutes = Math.abs(duration.toMinutesPart());
        long totalHours = Math.abs(duration.toHours());

        String status = duration.isNegative() ? "har passerat" : "är kvar";

        System.out.println("Vald dag: " + targetDate.getDayOfWeek() + " KL: " + targetDate.toLocalTime());
        System.out.printf("Nuvarande tid: %02d:%02d%n", today.getHour(), today.getMinute());
        System.out.println("---");

        System.out.println("Tid som " + status + ":");
        System.out.println("Dagar: " + totalDays + ", Timmar: " + hours + ", Minuter: " + minutes);

        System.out.println("Totalt i timmar: " + totalHours + " timmar och " + minutes + " minuter.");
    }
}