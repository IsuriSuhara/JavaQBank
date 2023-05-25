package main.java.com.koboMagic.javaQBank.dateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class InstantClass {

    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println(timestamp);
        Instant oneHourLater = Instant.now().plus(1, ChronoUnit.HOURS);
        System.out.println(oneHourLater);
        long secondsFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(),
                ChronoUnit.SECONDS);
        System.out.println(secondsFromEpoch);

        //Either a ZonedDateTime or an OffsetTimeZone object can be converted to an Instant object, as each maps to an
        // exact moment on the timeline. However, the reverse is not true. To convert an Instant object to a
        // ZonedDateTime or an OffsetDateTime object requires supplying time zone, or time zone offset, information.
        LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
                ldt.getYear(), ldt.getHour(), ldt.getMinute());
    }
}
