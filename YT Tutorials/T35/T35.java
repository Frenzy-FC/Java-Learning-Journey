public class T35{
    public static void main(String[] args){
        // Polymorphism: Function & Logic
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        Vehicle[] vehicles = {car, bike, boat};
    
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }

}