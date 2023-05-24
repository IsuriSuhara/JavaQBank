package main.java.com.koboMagic.javaQBank.dateTimeAPI;

import java.time.LocalTime;

public class DateTimeClasses {
    public static void main(String[] args) {
        LocalTime thisSec;

//        for (;;) {
            thisSec = LocalTime.now();

            // implementation of display code is left to the reader
            System.out.println(thisSec.getHour() +" "+ thisSec.getMinute() + " "+ thisSec.getSecond());
//        }
    }
}
