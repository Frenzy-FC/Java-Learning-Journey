package TASKS;
import java.util.Scanner;

public class TSK14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        // BANKING PROGRAM
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("=====================");
            System.out.println("FRENZ BANKING PROGRAM");
            System.out.println("=====================");
            System.out.println("[1] Show Balance");
            System.out.println("[2] Deposit");
            System.out.println("[3] Withdraw");
            System.out.println("[4] Exit");
            System.out.println("=====================");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
                
            }
            
            
        }
        System.out.println("=====================");
        System.out.println("THANK YOU FOR USING MY SYSTEM");
        System.out.println("=====================");
        scanner.close();
    }
    
    static void showBalance(double balance){
        System.out.println("=====================");
        System.out.printf("Balance: P%.2f\n", balance);
    }

    static double deposit(){

        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;

        System.out.print("Enter amount to be withrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Amount");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
