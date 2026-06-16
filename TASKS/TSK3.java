package TASKS;
import java.util.Scanner;
public class TSK3 {
    public static void main(String[] args){
        System.out.println("Welcome to Frenz Shopping Cart");
        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);
        String name;
        double price = 0;
        int quantity = 0;
        char currency = 'P';
        double total;

        System.out.print("Enter the product name: ");
        name = scanner.nextLine();

        System.out.print("Enter the prouduct's price: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        
        System.out.println("\nReceipt");
        System.out.println("Product: " + name);
        System.out.println("Price: " + currency + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + currency + total );
        





        scanner.close();
    }
}
