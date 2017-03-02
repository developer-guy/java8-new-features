package org.bthnpydn.java8.date.time.api;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * Created by bapaydin on 28.02.2017.
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println("Tomorrow : " + tomorrow);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("Yesterday : " + yesterday);

        LocalDate of = LocalDate.of(2017, Month.FEBRUARY, 28);
        int dayOfWeek = of.getDayOfWeek().ordinal();
        System.out.println("Day : " + getDayName(dayOfWeek));

        Locale locale = Locale.forLanguageTag("tr-TR");
        DateTimeFormatter turkishTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy").withLocale(locale);

        LocalDate date = LocalDate.parse("27.01.2016", turkishTimeFormatter);
        System.out.println("Parsed date : " + date);

        Date dateObj = Date.from(date.atStartOfDay(ZoneId.of("Turkey")).toInstant());
        System.out.println("Date : " + dateObj);
    }

    public static String getDayName(int ordinal){
        String[] dayNames = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        return dayNames[ordinal];
    }
}
