import java.util.Scanner;


public class T22 {
    public static void main(String[] args){
        // Entering a user input inside an array logic
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;
        int i;
        int j = 1;

        System.out.print("How many food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(i = 0; i < foods.length; i++){
            System.out.printf("Enter a food %d: ", j);
            foods[i] = scanner.nextLine();
            j++;
        }

        for(String food : foods){
            System.out.println(food);
        }



        scanner.close();

    }
}
