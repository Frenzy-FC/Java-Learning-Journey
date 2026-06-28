public class T29 {
    public static void main(String[] args){
        // Array of objects: Logic

        Auto auto = new Auto("mustang", "yellow");
        Auto auto1 = new Auto("lambo", "red");
        Auto auto2 = new Auto("ferar", "blue");

        Auto[] autos = {auto, auto1, auto2};

        for(Auto car : autos){
            car.color = "black";
        }

        for(Auto car : autos){
            car.drive();
        }

       
    }
}
