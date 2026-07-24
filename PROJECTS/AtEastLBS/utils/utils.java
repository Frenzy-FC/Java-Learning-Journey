package PROJECTS.AtEastLBS.utils;

import java.util.Random;
import java.util.Scanner;

import PROJECTS.AtEastLBS.data.data;

public class utils {
    // scanner util
    public static final Scanner scanner = new Scanner(System.in);
    // for centering the text
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
    
    // for displaying header 
    public static void header(String message){
        System.out.println("\n" + "=".repeat(50));
        System.out.println(center(message, 50));
        System.out.println("=".repeat(50));
    }

    // for generating user ID

    public static String userID(){
        Random random = new Random();

        String userID;

        do{
            int number = random.nextInt(9000) + 1000;

            userID = "MEM" + number;
        }while(data.users.containsKey(userID));

        return userID;
    }
}
