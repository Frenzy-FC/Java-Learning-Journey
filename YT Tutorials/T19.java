public class T19 {
    public static void main(String[] args){
        // Overloaded Method: Logics & Functions

        System.out.println(add(1., + 2.0, 3.0)); 

    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
}
