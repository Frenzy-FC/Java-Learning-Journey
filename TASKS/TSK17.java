package TASKS;
import java.util.Random;
import java.util.Scanner;
public class TSK17 {
    public static void main(String[] args){
        // ROCK PAPER SCISSORS GAME PROGRAM
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("ITS A TIE!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }while(playAgain.equals("yes"));
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
