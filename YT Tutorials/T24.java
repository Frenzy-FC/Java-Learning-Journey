import java.util.Scanner;

public class T24 {
    public static void main(String[] args){
        // Varargs: Function & Logic

        Scanner scanner = new Scanner(System.in);
        double[] grades;
        int size;
        int i;
        int j = 1;

        System.out.print("Enter how many grades you have: ");
        size = scanner.nextInt();

        grades = new double[size];
        for(i = 0; i < size; i++){
            System.out.printf("Enter grade #%d", j);
            grades[i] = scanner.nextDouble();
            j++;
        }

        System.out.println(average(grades));
        



        scanner.close();
    }

    static double average(double... grades){
        double sum = 0;

        if(grades.length == 0){
            return 0;
        }

        for(double grade : grades){
            sum += grade;
        }

        return sum / grades.length;
    }


}
