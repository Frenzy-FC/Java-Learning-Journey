package PROJECTS.AtEastATM.file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import PROJECTS.AtEastATM.data.data;
import PROJECTS.AtEastATM.model.Account;
import PROJECTS.AtEastATM.utils.utils;

public class fileManager {
    private static final String accountFile = "PROJECTS\\AtEastATM\\textFiles\\accounts.txt";
    private static final String transactionFile = "PROJECTS\\AtEastATM\\textFiles\\transactions";

    public static void saveUserAccount(Account account){
        try {
            File accfolder = new File("PROJECTS\\\\AtEastATM\\\\textFiles\\\\transactions");

            if(!accfolder.exists()){
                accfolder.mkdirs();
            }

            FileWriter accountWriter = new FileWriter(accountFile, true);

            accountWriter.write("=".repeat(50) + "\n");
            accountWriter.write("Full Name  : " + account.fullName + "\n");
            accountWriter.write("Username   : " + account.username + "\n");
            accountWriter.write("PIN        : " + account.pin + "\n");
            accountWriter.write(String.format("Balance    : PHP %.2f%n", account.deposit));
            accountWriter.write("=".repeat(50) + "\n\n");

            accountWriter.close();

        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }

    public static void loadUserAccounts(){
        File file = new File(accountFile);

        if (!file.exists()){
            return;
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while (reader.ready()){
                reader.readLine();

                String fullName = reader.readLine().split(":")[1].trim();

                String username = reader.readLine().split(":")[1].trim();

                int PIN = Integer.parseInt(reader.readLine().split(":")[1].trim());

                double deposit = Double.parseDouble(reader.readLine().split(":")[1].replace("₱", "").trim());

                reader.readLine();
                reader.readLine();
                Account account = new Account(fullName, username, PIN, deposit);

                data.accounts.put(username, account);


            }

            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        
    }

    public static void saveChanges(){
        try {
            FileWriter changeWriter = new FileWriter(accountFile);

            for(Account account : data.accounts.values()){
                changeWriter.write("=".repeat(50) + "\n");
                changeWriter.write("Full Name  : " + account.fullName + "\n");
                changeWriter.write("Username   : " + account.username + "\n");
                changeWriter.write("PIN        : " + account.pin + "\n");
                changeWriter.write(String.format("Balance    : PHP %.2f%n", account.deposit));
                changeWriter.write("=".repeat(50) + "\n\n");
            }

            changeWriter.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }

    public static void saveTransactions(Account account, String type, double amount){
        try{
            File transFolder = new File(transactionFile);

            if(!transFolder.exists()){
                transFolder.mkdirs();
            }

            String fileName = transactionFile + "\\" + account.username + ".txt";

            FileWriter transWriter = new FileWriter(fileName, true);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            transWriter.write("=".repeat(50) + "\n");
            transWriter.write("Type          : " + type + "\n");
            transWriter.write(String.format("Amount        : PHP %.2f%n", amount));
            transWriter.write(String.format("Total Balance : PHP %.2f%n", account.deposit));
            transWriter.write("Date          : " + LocalDateTime.now().format(formatter) + "\n");
            transWriter.write("=".repeat(50) + "\n\n");
            transWriter.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }


    }

    public static void loadTransactions(Account account){
        try{
            String fileName = transactionFile + "\\" + account.username + ".txt";

            File file = new File(fileName);

            if(!file.exists()){
                utils.error("No Transaction History ^^");
                return;
            }

            BufferedReader transReader = new BufferedReader(new FileReader(file));
            String line;
            int i = 1;
            boolean transNumber = true;
            while((line = transReader.readLine()) != null){
                if(line.equals("=".repeat(50))){
                    System.out.println("=".repeat(50));
                    if(transNumber){
                        
                        System.out.println("Transaction #" + i);
                        System.out.println("=".repeat(50));
                        i++;
                    }
                    transNumber = !transNumber;
                    continue;
                }

                System.out.println(line);
            }

            transReader.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
