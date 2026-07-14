package T37;

public class T37 {
    public static void main(String[] args){
        // GETTERS & SETTERS: Function & Logic
        Car car = new Car("Mustang", "Blue", 1000);
        car.setColor("Red");
        car.setPrice(1000000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
