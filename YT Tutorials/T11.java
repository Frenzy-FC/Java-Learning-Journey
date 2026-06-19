public class T11 {
    public static void main(String[] args){
        // Ternary Operator Logic

        int score = 60;
        int number = 6;
        int hours = 13;
        int income = 60000;

        String passFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.printf("Your score of %d: %s\n", score, passFail);
        
        String evenOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.printf("Your number of %d is %s\n", number, evenOdd);
        
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.printf("Your time of day is %s\n", timeOfDay);
        
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.printf("Your income is %d and your tax rate is %f\n", income, taxRate);

        
        
        

    }
}
