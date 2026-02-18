package feb18th;

import java.time.*;

public class DateTimeAPIDemo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);

        // Custom date
        LocalDate customDate = LocalDate.of(2026, 2, 18);
        System.out.println("Custom Date: " + customDate);
    }
}
