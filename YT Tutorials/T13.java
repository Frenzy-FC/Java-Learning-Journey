public class T13 {
    public static void main(String[] args){
        // Logical Operators
        double temp = 20;
        boolean isSunny = false;

        if(temp <= 30 && temp >=0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("It is sunny outside");
        }
        if(temp <= 30 && temp >=0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("It is cloudy outside");
        }

    }
}
