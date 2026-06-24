package TASKS;

public class TSK15 {
    public static void main(String[] args){
        // Telephone Display using 2D Array

        char[] row1 = {'1', '2', '3'};
        char[] row2 = {'4', '5', '6'};
        char[] row3 = {'7', '8', '9'};
        char[] row4 = {'*', '0', '#'};

        char[][] telephone = {row1, row2, row3, row4};

        for(char[] rows : telephone){
            for(char row : rows){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
