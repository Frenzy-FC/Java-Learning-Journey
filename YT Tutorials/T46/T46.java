package T46;

public class T46 {
    public static void main(String[] args) {
        // Anonymous class: Logic & Function
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo is meowing");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
