import java.util.Scanner;


public class T23 {
    public static void main(String[] args){
        // Searching a value in an array logic
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "orange", "banana"};
        String target;
        int i;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for(i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }


        scanner.close();
    }
}
