public class T25 {
    public static void main(String[] args){
        // 2D Array: Logic & Functions

        String[] city = {"Cagayan de Oro City", "Cebu City", "Davao City"};
        String[] country = {"Philippines", "America", "China"};
        String[][] places = {city, country};
        places[0][1] = "Manila City";

        for(String[] place : places){
            for(String plac : place){
                System.out.print(plac + ", ");
            }
            System.out.println();
        }
        
    }
}
