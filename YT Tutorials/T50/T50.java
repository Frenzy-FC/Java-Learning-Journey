package T50;
import java.util.Scanner;

public class T50 {
    public static void main(String[] args) {
        // Enums: Logic & Functions

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("it is the weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");

            }
        } 
        catch (IllegalArgumentException e) {
            System.out.println("please enter a valid day");
        }
     
      

        scanner.close();
    }
}
