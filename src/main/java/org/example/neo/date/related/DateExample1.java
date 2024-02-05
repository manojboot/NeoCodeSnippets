package org.example.neo.date.related;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateExample1 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date : "+localDate+" Date With Time : " +localDateTime);
        LocalDate localDateBefore10Days = LocalDate.now().minusDays(10);
        LocalDate localDateAfter10Days = LocalDate.now().minusDays(10);
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        int monthDay = LocalDate.now().getDayOfMonth();
        DayOfWeek dayOfWeekOnThatDate = LocalDate.of(1971,12,16).getDayOfWeek();
        System.out.println("Date Before 10Days : "+localDateBefore10Days);
        System.out.println("Date After 10Days : "+localDateAfter10Days);
        System.out.println("Day of Week : "+dayOfWeek);
        System.out.println("Day of Week On 16thDec 1971 : "+dayOfWeekOnThatDate);
        System.out.println("Day of MOnth : "+monthDay);
    }
}
