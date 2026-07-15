package T51;

import java.util.Scanner;

public class T51 {
    public static void main(String[] args) {
        //Threading: Function & Logic

        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 seconds to enter your name: ");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello" + name);
        scanner.close();
    }
}
