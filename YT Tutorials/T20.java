//int x = 1; Global Variable (But in java global variable is not allowed)

public class T20 {

    int x = 1; // Class Variable
    public static void main(String[] args){
        // Variable Scopes Logic

        int x = 2; // Local Variable

        System.out.println(x);

        myMethod();
    }
    static void myMethod(){
        int x = 3; // Local Variable

        System.out.println(x);

    }
}
