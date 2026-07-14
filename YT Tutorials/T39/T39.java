package T39;

public class T39 {

    public static void main(String[] args){

        // Composition: Logic & Function
    
        Car car = new Car("Mustang", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }

    
}
