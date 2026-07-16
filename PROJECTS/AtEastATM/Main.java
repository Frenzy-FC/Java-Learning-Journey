package PROJECTS.AtEastATM;
import java.util.InputMismatchException;
import PROJECTS.AtEastATM.service.ATM;
import PROJECTS.AtEastATM.utils.utils;
// main program
public class Main {
    public static void main(String[] args) {
        // AtEast ATM System
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("\n" + "=".repeat(50));
            System.out.println(utils.center("AtEast ATM", 50));
            System.out.println("=".repeat(50));
            System.out.println("1. Sign In\n2. Sign Up\n3. Exit");
            System.out.println("=".repeat(50));
            
            try {
                System.out.print("Enter your choice: ");
                choice = utils.scanner.nextInt();
                System.out.println("=".repeat(50));
                utils.scanner.nextLine();
                
                switch (choice) {
                    case 1 -> ATM.signIn();
                    case 2 -> ATM.signUp();
                    case 3 -> { 
                        System.out.println("Exit");
                        isRunning = false;
                    }
                    default -> utils.error("Invalid choice ^^");
                    
                }
            } 
            catch(InputMismatchException e){
                utils.error("Invalid Input ^^");
                utils.scanner.nextLine();
            }
            
            catch (Exception e) {
                utils.error("Something went wrong ^^");
            }
        }
        utils.scanner.close();
        
        
        
    }
    
    
}
