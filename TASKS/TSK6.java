package TASKS;
import java.util.Scanner;

public class TSK6 {
    public static void main(String[] args){
        // Compound Interest Calculator
        System.out.println("Welcome to Frenz CIC (Compound Interest Calculator");

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the $ times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the $ per year: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is P%.2f", years, amount);
        

        scanner.close();


    }
}
