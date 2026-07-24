package PROJECTS.AtEastLBS.service;

import PROJECTS.AtEastLBS.file.fileManager;
import PROJECTS.AtEastLBS.data.data;
import PROJECTS.AtEastLBS.model.admin;
import PROJECTS.AtEastLBS.model.user;
import PROJECTS.AtEastLBS.utils.utils;

public class auth {
    // Sign In
    public static void signIn(){
        utils.header("AtEast Sign In");
        System.out.println("\n" + "=".repeat(50));
        System.out.print("Enter User ID: ");
        String userID = utils.scanner.nextLine();
        System.out.println("=".repeat(50));
        
        // checks if admin
        admin admin = data.admins.get(userID);
        
        if(admin != null){
            utils.header("Admin Sign In");
            System.out.print("Enter Username: ");
            String adminUser = utils.scanner.nextLine();
            System.out.println("=".repeat(50));
            System.out.print("Enter Password: ");
            String adminPass = utils.scanner.nextLine();
            System.out.println("=".repeat(50));

            if(admin.username.equals(adminUser) && admin.password.equals(adminPass)){
                utils.success("^_^ Welcome Admin");
                //not implement yet
                //dashboard.adminDashboard(admin);
                return;
            }
            
            utils.error("Invalid username or password ^_^");
            
        }
        
        // checks if user
        user user = data.users.get(userID);
        
        if(user != null){
            utils.success("Welcome "+ user.fullName);
            
            //not implement yet
            //dashboard.userDashboard(user);
            return;
        }

        utils.error("Account not found ^-^");

    }
    // Sign Up
    public static void signUp(){
        utils.header("AtEast Sign Up");
        System.out.println("\n" + "=".repeat(50));
        System.out.print("Full Name: ");
        String userName = utils.scanner.nextLine();
        System.out.println("=".repeat(50));
        System.out.print("Contact Number: ");
        String userContact = utils.scanner.nextLine();
        System.out.println("=".repeat(50));

        String userID = utils.userID();

        user user = new user(userID, userID, userContact);

        data.users.put(userID, user);

        fileManager.saveUsersAccount(user);

        utils.success("Registration Completed ^_^");
        System.out.println("Save your user ID ^_^");
        System.out.println("Your Member ID: " + userID);

    }

}
