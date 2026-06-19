package TASKS;
import java.util.Scanner;

public class TSK9 {
    public static void main(String[] args){
        // Calculator Program
        System.out.println("Welcome to Frenz Calculator Program");

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operation;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the secondnumber: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+'-> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot be divide by zero");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator");
                validOperation = false;
            }
        }

        if (validOperation){
            System.out.println(result);
        }


        scanner.close();

    }
}
