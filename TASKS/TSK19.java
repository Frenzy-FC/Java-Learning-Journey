package TASKS;

import java.util.ArrayList;
import java.util.Scanner;

public class TSK19 {
    public static void main(String[] args){
        // Storing Food Inside an arrayList program
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        int numOfFood;
        int i;
        String food;
        System.out.print("Enter how many foods would you like to buy: ");
        numOfFood = scanner.nextInt();
        scanner.nextLine();
        for(i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i +": ");
            food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        scanner.close();
    }
}
