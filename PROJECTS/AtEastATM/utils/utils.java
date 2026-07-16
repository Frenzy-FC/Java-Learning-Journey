package PROJECTS.AtEastATM.utils;
import java.util.Scanner;
// for utilities
public class utils {
    // scanner util
    public static final Scanner scanner = new Scanner(System.in);
    // for centering text
    public static String center(String text, int width){
        if(text.length() >= width){
            return text;
        }

        int totalPadding = width - text.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;
        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
    }
    // for displaying error
    public static void error(String message){
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ERROR J_J: " + message);
        System.out.println("=".repeat(50));
    }
    // for displaying success
    public static void success(String message){
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SUCCESS ^_^: " + message);
        System.out.println("=".repeat(50));
    }

}
