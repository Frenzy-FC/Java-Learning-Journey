package TASKS;

import java.util.Scanner;
public class TSK4 {
    public static void main(String[] args){
        // HYPOTENUSE TRIANGLE CALCULATOR
        // Formula: c = a² + b²
        System.out.println("Welcome to Frenz HTC (HYPOTENUSE TRIANGLE CALCULATOR");

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse triangle of " + a + " and " + b + " is: " + c);



        scanner.close();

        
    }
}
