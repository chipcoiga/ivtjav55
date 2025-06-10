package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateTime);

        LocalDate halloween1 = LocalDate.of(2015, Month.OCTOBER,31);
        LocalDate halloween2 = LocalDate.of(2015,10,31);
        LocalTime startTime = LocalTime.of(14,32); //minutes
        LocalDateTime startDateTime = LocalDateTime.of(2015,10,31,14,32);

        LocalDate halloween3 = LocalDate.parse("2015-10-31");
        LocalTime startTime4 = LocalTime.parse("02:32:45");
        LocalDateTime startDateTime2 = LocalDateTime.parse("2015-10-31T02:32:45.123456789");

        halloween3.plusDays(3);
        System.out.println(halloween1.getYear());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        String format = startDateTime2.format(formatter);
        System.out.println(format);
    }
}
