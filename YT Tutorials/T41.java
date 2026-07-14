import java.util.ArrayList;
import java.util.Collections;

public class T41 {
    public static void main(String[] args){
        // ArrayList: Logic & Function

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(0);
        fruits.set(0, "watermelon");
        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
       
    }
}
