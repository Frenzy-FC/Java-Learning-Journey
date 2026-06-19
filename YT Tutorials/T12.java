import java.util.Scanner;

public class T12 {
    public static void main(String[] args){
        //Enhanced Switch: LOGIC/FUNCTIONS
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }


        scanner.close();

    }
}
