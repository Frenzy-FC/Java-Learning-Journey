import java.util.InputMismatchException;
import java.util.Scanner;

public class T42 {
    public static void main(String[] args){
        //Exception: Logic & Function

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number");
            int number = scanner.nextInt();
            System.out.println(number);
        } 
        catch(InputMismatchException e){
            System.out.println("That was not a number");
        }
        catch(ArithmeticException e){
            System.out.println("you can't divide by zero");
        }
        
        catch (Exception e) {
            System.out.println("something went wrong");
        }
        finally{
            System.out.println("this always executes");
        }
    }
}
