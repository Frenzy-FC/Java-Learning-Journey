import java.util.Scanner;

public class T3 {
    public static void main(String[] args){
        // user input
        Scanner scanner = new Scanner(System.in);

        // user input for strings
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // user input for integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // user input for double
        System.out.print("Enter your gwa: ");
        double gwa = scanner.nextDouble();

        // user input for boolean
        System.out.println("Are you gay? (true/fales)");
        boolean isGay = scanner.nextBoolean();

        // user input for boolean (if version)
        if(isGay){
            System.out.println("You are gay congratulation : >");
        }
        else{
            System.out.println("Better luck next time : >");
        }

        System.out.println("I am " + name + age + " years old" + ", My current gwa is " + gwa);

        scanner.close();

    }
}
