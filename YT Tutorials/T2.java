public class T2 {
    public static void main(String[] args){
        // data types: primitive
        int age = 18;
        int quantity = 10;

        System.out.println(age + " " + quantity );

        double price = 15.5;
        double gwa = 3.00;
        double height = 1.5;

        System.out.println("The " + price + " of my " + gwa + " is my" + height);

        char currency = '$';
        char fail = 'x';

        System.out.println("My failing symbol is " + fail + " and my currency symbol is " + currency);

        boolean isGay = true;
        boolean isGoat = false;

        System.out.println("Vann is not a Goat: " + isGoat + " therefore he is Gay: " + isGay);

        // data types: reference
        String name = "Frenz Carlo C. Cuarteros";
        String course = "BSIT";
        String year = "1st Year";

        System.out.println("I am " + name + " , I took the " + course + " course and currently also a " + year);

    }
}
