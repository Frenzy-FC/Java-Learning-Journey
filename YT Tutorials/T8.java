public class T8 {
    public static void main(String[] args){
        // Nested IF statement logic

        boolean isStraight = false;
        boolean isGay = true;
        double price = 9.99;

        if(isStraight){
            if(isGay){
                System.out.println("You get a gay discount of 20%");
                System.out.println("You get a straight discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a straight discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isGay){
                System.out.println("You get a gay discount of 20%");
                price *= 0.8;

            }
            else{
                price *= 1;

            }
        }
        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
