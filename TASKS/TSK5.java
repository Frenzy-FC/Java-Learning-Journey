package TASKS;
import java.util.Scanner;

public class TSK5 {
    public static void main(String[] args){
        // Circumference | Area | Volume Calculator
        // Formula:
        // Circumference: 2 * PI * Radius
        // Area: PI * Radius²
        // Volume: (4 / 3) * PI * Radius³

        System.out.println("Welcome to Frenz CAVC (Circumference | Area | Volume Calculator)");
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("\nThe circumference is: %.2f", circumference);
        System.out.printf("\nThe area is: %.2f", area);
        System.out.printf("\nThe volume is: %.2f", volume);

        scanner.close();






    }
}
