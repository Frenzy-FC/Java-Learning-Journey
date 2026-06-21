package TASKS;
import java.util.Scanner;

public class TSK13 {
    public static void main(String[] args){
        // GRID Program using Nested Loops

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        int i;
        int j;
        char symbol;

        System.out.print("Enter how many rows?: ");
        rows = scanner.nextInt();

        System.out.print("Enter how many columns?: ");
        columns = scanner.nextInt();

        System.out.print("Enter what symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(i = 0; i < rows; i++){
            for(j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }


        scanner.close();
    }
}
