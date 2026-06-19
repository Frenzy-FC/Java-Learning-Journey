package TASKS;
import java.util.Random;
import java.util.Scanner;

public class TSK11 {
    public static void main(String[] args){
        // Number Guessing Game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);
        
        System.out.println("Welcome to Frenz Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);
        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("TOO LOW BUD");
            }
            else if (guess > randomNumber){
                System.out.println("TOO HIGH BUD");
            }
            else{
                System.out.printf("CORRECT The number was %d\n", randomNumber);
                System.out.printf("# of attempts: %d", attempts);
            }
        }while(guess != randomNumber);



        scanner.close();
    }

}
