import java.util.Scanner;

public class T10 {
    public static void main(String[] args){
        // Substring Method Logic/Functions
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your gmail account: ");
        email = scanner.nextLine();

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.printf("Your email is %s, by slicing your username is %s and your domain is %s", email, username, domain);



        scanner.close();
    }
}
