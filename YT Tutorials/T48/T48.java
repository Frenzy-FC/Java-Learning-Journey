package T48;

public class T48 {
    public static void main(String[] args) {
        // Generics: Function & Logic
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);
        
    }
}
