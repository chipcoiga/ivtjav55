package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.TreeSet;

public class MainProfileDemo {
    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setUsername("chipcoiga");
        profile.setBirthday(LocalDate.of(2000, 6, 6));

        LocalDate now = LocalDate.now(); //2025-06-07
        Period period = profile.getBirthday().until(now);
        int years = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();
        System.out.println(years);
        System.out.println(month);
        System.out.println(day);

        TreeSet<String> sortedZones = new TreeSet<>(ZoneId.getAvailableZoneIds());

        System.out.println("Number of zones: " + sortedZones.size());
        System.out.println("");

        for (String zone : sortedZones) {
            System.out.println(zone);
        }

        ZoneId zoneId = ZoneId.of("UTC");
        System.out.println(LocalDateTime.now(zoneId));
    }
}
