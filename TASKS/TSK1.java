package TASKS;
import java.util.Scanner;

public class TSK1 {
    public static void main(String[] args){
        // Area of a rectangle calculator
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Welcome to Frenz Calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();


    }
}
