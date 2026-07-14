package T36;
import java.util.Scanner;

public class T36 {
    public static void main(String[] args){
        // Runtime Polymorphism: Function & Logic
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Animal animal;
        while(isRunning){

            System.out.print("Are you a dog or a cat? (dog = 1, cat = 2): ");
            int choice = scanner.nextInt();
    
            if (choice == 1){
                animal = new Dog();
                animal.speak();
            }
            else if(choice == 2){
                animal = new Cat();
                animal.speak();
            }
            else if(choice == 3){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }

        }    


        scanner.close();

    }
}
