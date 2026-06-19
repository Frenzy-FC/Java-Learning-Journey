import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class T14 {
    public static void main(String[] args){
        // While Loop & Do While Loop Logic | Functions

        Scanner scanner = new Scanner(System.in);

        // Example #1
        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }

        System.out.printf("Hello %s", name);

        // Example #2

        String response = "";

        while(!response.equals("Q")){
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit");

        // Example #3

        int age = 0;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        scanner.close();
    }
}
