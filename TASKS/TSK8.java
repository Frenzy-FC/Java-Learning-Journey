package TASKS;
import java.util.Scanner;

public class TSK8 {
    public static void main(String[] args){
        // Temperature Converter Program: Ternary Operator
        System.out.println("Welcome to Frenz TCP (Temperature Converter Program)");

        Scanner scanner = new Scanner(System.in);
        // (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Enter unit of measurement (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("THe new temp in %s is %.2f", unit, newTemp);


        scanner.close();

    }
}
