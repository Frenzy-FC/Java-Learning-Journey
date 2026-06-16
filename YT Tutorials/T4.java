import java.util.Scanner;

public class T4 {
    public static void main(String[] args){
        // If/Else If/Else

        Scanner scanner = new Scanner(System.in);
        String name;
        int age = 0;
        boolean isGay;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you gay? (true/false): ");
        isGay = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You have a dementia, you did not enter your name");
        }
        else{
            System.out.println("Hellow " + name);
        }

        if(age >= 65){
            System.out.println("You are a senior menz");
        }
        else if(age >= 18){
            System.out.println("You are a adult");
        }
        else if(age == 0){
            System.out.println("You are a baby");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet");
        }
        else{
            System.out.println("You are a kid");
        }

        if(isGay){
            System.out.println("Congratulations");
        }
        else{
            System.out.println("How dissapointing");
        }
        scanner.close();

    }
}
