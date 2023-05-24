package main.java.com.koboMagic.javaQBank.dateTimeAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateClasses {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
        System.out.println(date);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWed);
        DayOfWeek dotw = LocalDate.of(2012, Month.JULY, 9).getDayOfWeek();
        System.out.println(dotw);

        LocalDate date1 = LocalDate.of(2000, Month.NOVEMBER, 20);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWed1 = date1.with(adj);
        System.out.printf("For the date of %s, the next Wednesday is %s.%n", date1, nextWed1);
       //Here, %s acts as a placeholder for the string value of name, and it gets replaced with the actual value during
        // formatting.
        //%n: It is a platform-independent newline character. It is used to insert a newline into the formatted string.

        YearMonth date0 = YearMonth.now();
        System.out.printf("%s: %d%n", date0, date0.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

        MonthDay monthDay = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = monthDay.isValidYear(2010);
        System.out.println(validLeapYear);
        System.out.println(Year.of(2012).isLeap());

        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2021,Month.OCTOBER, 21).plusYears(2).plusMonths(10).plusDays(6),LocalDate.now()));
        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2021,Month.OCTOBER, 21),LocalDate.now()));


    }

}
