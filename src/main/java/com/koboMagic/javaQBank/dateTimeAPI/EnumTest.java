package main.java.com.koboMagic.javaQBank.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EnumTest {
    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale localeWeek = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, localeWeek));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, localeWeek));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, localeWeek));
        System.out.println();
        System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));
        System.out.println();

        Month month = Month.AUGUST;
        Locale localeMonth = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, localeMonth));
        System.out.println(month.getDisplayName(TextStyle.NARROW, localeMonth));
        System.out.println(month.getDisplayName(TextStyle.SHORT, localeMonth));
    }
}
