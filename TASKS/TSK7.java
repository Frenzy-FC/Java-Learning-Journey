package TASKS;
import java.util.Scanner;
public class TSK7 {
    public static void main(String[] args){
        // Weight Conversion Program
        System.out.println("Welcome to Frenz WCC (Weight Conversion Program");
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Options");
        System.out.println("[1] Convert LBS to KG");
        System.out.println("[2] Convert KG to LBS");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter your weight in LBS: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;

            System.out.printf("Your new weight in KG is %.2f", newWeight);
        }
        else if (choice == 2){
            System.out.print("Enter your weight in KG: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;

            System.out.printf("Your new weight in LBS is %.2f", newWeight);
        }
        else{
            System.out.println("Invalid Input");
        }


        scanner.close();
    }
}
