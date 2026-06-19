package TASKS;
import java.util.Scanner;

public class TSK10 {
    public static void main(String[] args){
        // Username validator program using logical operators
        System.out.println("Welcome to Frenz Username Validator Program");

        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12 ){
            System.out.println("Username must be between 4-12");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.printf("Welcome %s", username);
        }

        scanner.close();


    }
}
