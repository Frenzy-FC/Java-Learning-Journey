import java.util.Arrays;

public class T21 {
    public static void main(String[] args){
        // Array: Functions & Logics

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        // change the value in a given index #
        fruits[0] = "pineapple";

        // gives the size of an array
        int numOfFruits = fruits.length;

        // sort the array from a-z 1-infinity
        Arrays.sort(fruits);

        // fills all existing value with 1 value
        Arrays.fill(fruits, "pineapple");

        // enhance for loop for arrays
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
