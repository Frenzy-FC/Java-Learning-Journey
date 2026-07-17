package PROJECTS.AtEastATM.service;
import java.util.InputMismatchException;
import PROJECTS.AtEastATM.data.data;
import PROJECTS.AtEastATM.file.fileManager;
import PROJECTS.AtEastATM.model.Account;
import PROJECTS.AtEastATM.utils.utils;


public class ATM {
    // Sign Up 
    public static void signUp(){
        boolean isRunning = true;
        int pin = 0;
        double deposit = 0;
        String username = "";
        System.out.println("\n" + "=".repeat(50));
        System.out.println(utils.center("AtEast Sign Up", 50));
        System.out.println("=".repeat(50));
        
        try {
            System.out.println("\n" + "=".repeat(50));
            System.out.print("Enter Your Full Name: ");
            String fullName = utils.scanner.nextLine();
            System.out.println("=".repeat(50));
            while(isRunning){
                System.out.print("Enter Your Username: ");
                username = utils.scanner.nextLine();
                System.out.println("=".repeat(50));
                // checks if username is already exist in the data
                if(data.accounts.containsKey(username)){
                    utils.error("Username already exists ^^ try again");
                    continue;
                }
                else{
                    isRunning = false;
                }
            }

            while(!isRunning){
                System.out.print("Enter Your PIN: ");
                pin = utils.scanner.nextInt();
                System.out.println("=".repeat(50));
                // checks if pin not 0000 or 5 digits or more
                if(pin < 1000 || pin > 9999){
                    utils.error("Invalid Pin ^^ Must be 4 DIGIT Pin");
                    System.out.println("=".repeat(50));
                    continue;
                }
                else{
                    isRunning = true;
                }
            }
            
            while(isRunning){
                
                System.out.print("Enter your Initial Deposit: ");
                deposit = utils.scanner.nextDouble();
                System.out.println("=".repeat(50));
                // checks if initial deposit is less than 0 or not in a minimum of 100
                if (deposit <= 0){
                    utils.error("Initial Deposit cannot be negative ^^");
                    continue;
                }
                else if (deposit < 100){
                    utils.error("Minimum of 100 only ^^");
                    continue;
                }
                else{
                    isRunning = false;
                }
            }
            
            Account account = new Account(fullName, username, pin, deposit);
            data.accounts.put(username, account);
            fileManager.saveUserAccount(account);

            utils.success(username + " has been successfully created ^^");


        } 
        // safety net
        catch(InputMismatchException e){
            utils.error("Invalid input ^^");
            utils.scanner.nextLine();
        }
        catch (Exception e) {
            utils.error("Something went wrong");
        }
    }
    //Sign In
    public static void signIn(){
        String username = "";
        int pin = 0;
        boolean isRunning = true;
        System.out.println("\n" + "=".repeat(50));
        System.out.println(utils.center("AtEast Sign In", 50));
        System.out.println("=".repeat(50));
        try {
            while(isRunning){
                System.out.println("\n" + "=".repeat(50));
                System.out.print("Enter Username: ");
                username = utils.scanner.nextLine();
                System.out.println("=".repeat(50));
                Account account = data.accounts.get(username);
                //checks if username not in data
                if(account == null){
                    utils.error("Account not found ^^");
                    return;
                }
                
                System.out.print("Enter PIN: ");
                pin = utils.scanner.nextInt();
                utils.scanner.nextLine();
                System.out.println("=".repeat(50));
                //checks if pin not equal to the actual pin stored in the data
                if(account.pin != pin){
                    utils.error("Incorrect PIN ^^");
                    continue;
                }
                
                utils.success("Login Successfully as " + username);
                //redirects to own user dashboard
                userDashboard(account);
                //exits the sign in
                return;

            }
        } 
        // safety net
        catch(InputMismatchException e){
            utils.error("PIN must be a number ^^");
            utils.scanner.nextLine();
        }
        
        catch (Exception e) {
            utils.error("Something went wrong ^^");
        }
    }
    // User Dashboard
    private static void userDashboard(Account account){
        boolean isRunning = true;
        while(isRunning){
            System.out.println("\n" + "=".repeat(50));
            System.out.println(utils.center("Welcome " + account.username, 50));
            System.out.println("=".repeat(50));
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Transfer Money\n5. Change PIN\n6. Transaction History\n7. Logout");
            System.out.println("=".repeat(50));
            System.out.println("\n" + "=".repeat(50));
            try{
                System.out.print("Enter your choice: ");
                int choice = utils.scanner.nextInt();
                utils.scanner.nextLine();
                System.out.println("=".repeat(50));
                switch (choice) {
                    case 1 -> {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.printf("Your current balance %s is PHP %.2f", account.username, account.deposit);
                        System.out.println("\n" + "=".repeat(50));
                    }
                    case 2 -> {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.print("Enter amount to deposit: ");
                        double amount = utils.scanner.nextDouble();
                        utils.scanner.nextLine();
                        System.out.println("\n" + "=".repeat(50));
                        //checks if amount not negative
                        if(amount <= 0){
                            utils.error("Amount can't be negative ^^");
                            continue;
                        }
                        account.deposit += amount;
                        fileManager.saveChanges();
                        utils.success(String.format("Added PHP %.2f to bank account", amount ));
                        System.out.printf("Total balance: PHP %.2f", account.deposit);
                        System.out.println("\n" + "=".repeat(50));
                        // store in transaction history
                        fileManager.saveTransactions(account, "Deposit", amount);
                    }
                    case 3 -> {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = utils.scanner.nextDouble();
                        utils.scanner.nextLine();
                        System.out.println("\n" + "=".repeat(50));
                        //checks if withdraw amount is negative or greater than the current balance
                        if(withdrawAmount < 0){
                            utils.error("Withdraw amount can't be negative ^^");
                            continue;
                        }
                        else if(withdrawAmount > account.deposit){
                            utils.error("Insufficient Funds ^^");
                            continue;
                        }
                        else{
                            account.deposit -= withdrawAmount;
                            fileManager.saveChanges();
                            utils.success(String.format("Withdraw PHP %.2f successfully", withdrawAmount ));
                            System.out.printf("Total balance: PHP %.2f", account.deposit);
                            System.out.println("\n" + "=".repeat(50));
                            // store in transaction history
                            fileManager.saveTransactions(account, "Withdraw", withdrawAmount);
                        }
                    }
                    case 4 -> {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.println(utils.center("Transfer Money", 50));
                        System.out.println("=".repeat(50));
                        
                        System.out.println("\n" + "=".repeat(50));
                        System.out.print("Enter the username to transfer money: ");
                        String userTransfer = utils.scanner.nextLine();
                        System.out.println("\n" + "=".repeat(50));
                        Account accTransfer = data.accounts.get(userTransfer);
                        //checks if acc not exist in the data
                        if(accTransfer == null){
                            utils.error("Account not found ^^");
                            continue;
                        }
                        System.out.print("Enter the amount to transfer: ");
                        double amountTrans = utils.scanner.nextDouble();
                        utils.scanner.nextLine();
                        System.out.println("=".repeat(50));
                        // checks the amount to transfer either not negative or greater than the current balance of the account
                        if(amountTrans < 0){
                            utils.error("Amount to transfer can't be negative ^^");
                            continue;
                        }
                        else if (account.deposit < 100){
                            utils.error("Current Balance 100 ^^");
                            continue;
                        }
                        else if (amountTrans > account.deposit){
                            utils.error("Insufficient Funds ^^");
                            continue;
                        }
                        else{
                            account.deposit -= amountTrans;
                            accTransfer.deposit += amountTrans;
                            fileManager.saveChanges();
                            utils.success(String.format("PHP %.2f has been transfer successfully to %s", amountTrans, accTransfer.username));
                            System.out.printf("Total Balance: P%.2f", account.deposit);
                            System.out.println("\n" + "=".repeat(50));
                            // store in transaction history
                            fileManager.saveTransactions(account, "Transfer: " + accTransfer.username, amountTrans);
                            fileManager.saveTransactions(accTransfer, "Received: " + account.username, amountTrans);
                            
                            
                        }
                    }
                    case 5 -> {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.println(utils.center("Change PIN", 50));
                        System.out.println("=".repeat(50));
                        
                        System.out.println("\n" + "=".repeat(50));
                        System.out.print("Enter current PIN: ");
                        int currentPin = utils.scanner.nextInt();
                        utils.scanner.nextLine();
                        System.out.println("=".repeat(50));
                        //checks if pin not equal the account pin
                        if(account.pin != currentPin){
                            utils.error("Incorrect PIN");
                            continue;
                        }
                        System.out.print("Enter new PIN: ");
                        int newPIN = utils.scanner.nextInt();
                        utils.scanner.nextLine();
                        System.out.println("=".repeat(50));
                        System.out.print("Confirm new PIN: ");
                        int confirmPIN = utils.scanner.nextInt();
                        utils.scanner.nextLine();
                        System.out.println("=".repeat(50));
                        //check if new pin and confirm pin match
                        if(newPIN != confirmPIN){
                            utils.error("New PIN not match");
                            continue;
                        }
                        else{
                            // sets the pin to new pin
                            account.pin = newPIN;
                            fileManager.saveChanges();
                            utils.success("PIN has been change successfully ^^");
                        }
                        
                    }
                    case 6 -> {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.println(utils.center("Transaction History: " + account.username, 50));
                        System.out.println("=".repeat(50));
                        fileManager.loadTransactions(account);
                    }
                    case 7 -> {utils.success("Logging out... as " + account.username);
                                isRunning = false;
                    }
                    default -> utils.error("Invalid Choice ^^");
                }
            }
            catch(InputMismatchException e){
                utils.error("Invalid Input ^^");
                utils.scanner.nextLine();
            }
            catch(Exception e){
                utils.error("Something went wrong ^^");
            }
            
        }

    }

}
