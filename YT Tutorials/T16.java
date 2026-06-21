public class T16 {
    public static void main(String[] args){
        // For Loop: Break & Continue Logic
        
        int i;

        for(i = 0; i < 10; i++){
            if(i == 3){
                continue;
            }
            else if(i == 5){
                break;
            }

            System.out.println(i + " ");
        }
    }
}
