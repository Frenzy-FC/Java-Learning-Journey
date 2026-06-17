import java.util.Random;

public class T5 {
    public static void main(String[] args){
        // Random module/library functions and logics
        Random random = new Random();

        int number1;
        double number2;
        boolean isGay;

        number1 = random.nextInt();
        number2 = random.nextDouble();
        isGay = random.nextBoolean();

        System.out.println("The random int is " + number1 + ", the random double is " + number2 + ", Am I gay?: " + isGay);
    }
}
