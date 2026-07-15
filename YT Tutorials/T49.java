import java.util.HashMap;

public class T49 {
    public static void main(String[] args) {
        // HashMap: Logic & Function

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.75);

        map.remove("Apple");
        System.out.println(map.get("coconut"));
        System.out.println(map.containsKey("coconut"));
        System.out.println(map.containsValue("1.00"));
        System.out.println(map.size());
    }
}
