import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T45 {
    public static void main(String[] args) {
        // Dates & Times: Logic & Function

        //Current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //Current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // UTC Timestamp
        Instant instant = Instant.now();
        System.out.println(instant);

        //Custome format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        //Comparing dates & times
        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
