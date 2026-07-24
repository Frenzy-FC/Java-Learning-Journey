package PROJECTS.AtEastLBS.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;



import PROJECTS.AtEastLBS.utils.utils;
import PROJECTS.AtEastLBS.data.data;
import PROJECTS.AtEastLBS.model.admin;
import PROJECTS.AtEastLBS.model.book;
import PROJECTS.AtEastLBS.model.borrowLog;
import PROJECTS.AtEastLBS.model.user;

public class fileManager {
    // relative paths
    private static final String LBSFolder = "PROJECTS\\AtEastLBS\\textFiles";
    private static final String bookFile = "PROJECTS\\AtEastLBS\\textFiles\\books.txt";
    private static final String userFile = "PROJECTS\\AtEastLBS\\textFiles\\users.txt";
    private static final String borrowFile = "textFiles\\borrowRecords.txt";
    private static final String adminFile = "PROJECTS\\AtEastLBS\\textFiles\\admins.txt";
    // for saving a book
    public static void saveBooks(book book){
        try {
            File folder = new File(LBSFolder);

            if(!folder.exists()){
                folder.mkdirs();
            }

            FileWriter bookWriter = new FileWriter(bookFile, true);

            bookWriter.write("=".repeat(50) + "\n");
            bookWriter.write("Book ID         : " + book.bookID + "\n");
            bookWriter.write("Title           : " + book.bookTitle+ "\n");
            bookWriter.write("Author          : " + book.bookAuthor + "\n");
            bookWriter.write("Category        : " + book.bookCat + "\n");
            bookWriter.write("Year Published  : " + book.yearPub + "\n");
            bookWriter.write("Available       : " + book.isAvailable + "\n");
            bookWriter.write("=".repeat(50) + "\n\n");

            bookWriter.close();

        }  
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for loading a book
    public static void loadBooks(){
        File file = new File(bookFile);

        if(!file.exists()){
            return;
        }

        try {
            BufferedReader bookReader = new BufferedReader(new FileReader(file));

            while(bookReader.ready()){
                bookReader.readLine();

                String bookID = bookReader.readLine().split(":")[1].trim();
                String bookTitle = bookReader.readLine().split(":")[1].trim();
                String bookAuthor = bookReader.readLine().split(":")[1].trim();
                String bookCat = bookReader.readLine().split(":")[1].trim();
                int year = Integer.parseInt(bookReader.readLine().split(":")[1].trim());
                boolean isAvailable = Boolean.parseBoolean(bookReader.readLine().split(":")[1].trim());
                
                bookReader.readLine();
                bookReader.readLine();

                book Book = new book(bookID, bookTitle, bookAuthor, bookCat, year, isAvailable);

                data.books.put(bookID, Book);
            
            
            
            }

            bookReader.close();
            
        }   
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for save changes of the book
    public static void saveBookChanges(){
        try {
            FileWriter bookChangeWriter = new FileWriter(bookFile);

            for(book book : data.books.values()){
                bookChangeWriter.write("=".repeat(50) + "\n");
                bookChangeWriter.write("Book ID         : " + book.bookID + "\n");
                bookChangeWriter.write("Title           : " + book.bookTitle+ "\n");
                bookChangeWriter.write("Author          : " + book.bookAuthor + "\n");
                bookChangeWriter.write("Category        : " + book.bookCat + "\n");
                bookChangeWriter.write("Year Published  : " + book.yearPub + "\n");
                bookChangeWriter.write("Available       : " + book.isAvailable + "\n");
                bookChangeWriter.write("=".repeat(50) + "\n\n");

            }
            bookChangeWriter.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for saving a user
    public static void saveUsersAccount(user user){
        try {
            File folder = new File(LBSFolder);

            if(!folder.exists()){
                folder.mkdirs();
            }

            FileWriter userWriter = new FileWriter(userFile, true);
            userWriter.write("=".repeat(50) + "\n");
            userWriter.write("User ID        : " + user.userID + "\n");
            userWriter.write("Full Name      : " + user.fullName + "\n");
            userWriter.write("Contact Number : " + user.contactNum + "\n");
            userWriter.write("=".repeat(50) + "\n\n");

            userWriter.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for loading a user
    public static void loadUsersAccount(){
        File file = new File(userFile);

        if(!file.exists()){
            return;
        }

        try {
            BufferedReader userReader = new BufferedReader(new FileReader(file));

            while (userReader.ready()) {
                userReader.readLine();
                
                String userID = userReader.readLine().split(":")[1].trim();
                String fullName = userReader.readLine().split(":")[1].trim();
                String contactNum = userReader.readLine().split(":")[1].trim();
                
                userReader.readLine();
                userReader.readLine();

                user user = new user(userID, fullName, contactNum);
                data.users.put(userID, user);
            }

            userReader.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for save changes of the user
    public static void saveUserChanges(){
        try {
            FileWriter userWriter = new FileWriter(userFile);

            for(user user : data.users.values()){
                userWriter.write("=".repeat(50) + "\n");
                userWriter.write("User ID        : " + user.userID + "\n");
                userWriter.write("Full Name      : " + user.fullName + "\n");
                userWriter.write("Contact Number : " + user.contactNum + "\n");
                userWriter.write("=".repeat(50) + "\n\n");  
            }

            userWriter.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for save a borrow logs
    public static void saveBorrowLogs(borrowLog log){
        try {
           File folder = new File(LBSFolder);

            if(!folder.exists()){
                folder.mkdirs();
            }

            FileWriter borrowWriter = new FileWriter(borrowFile, true);

            borrowWriter.write("=".repeat(50) + "\n");
            borrowWriter.write("Book ID      : " + log.bookID + "\n");
            borrowWriter.write("User ID      : " + log.userID + "\n");
            borrowWriter.write("Borrow Date  : " + log.borrowDate + "\n");

            if(log.returnDate == null){
                borrowWriter.write("Return Date  : Not Returned\n");
            }
            else{
                borrowWriter.write("Return Date  : " + log.returnDate + "\n");
            }

            borrowWriter.write("Returned     : " + log.isReturned + "\n");
            borrowWriter.write("=".repeat(50) + "\n\n");

            borrowWriter.close(); 
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for loading borrow logs
    public static void loadBorrowLogs(){
        File file = new File(borrowFile);

        if(!file.exists()){
            return;
        }

        try {
            BufferedReader reader =
                new BufferedReader(new FileReader(file));

            while(reader.ready()){

                reader.readLine();

                String bookID =
                        reader.readLine().split(":")[1].trim();

                String userID =
                        reader.readLine().split(":")[1].trim();

                LocalDateTime borrowDate =
                        LocalDateTime.parse(
                                reader.readLine().split(":")[1].trim()
                        );

                String returnLine =
                        reader.readLine().split(":")[1].trim();

                LocalDateTime returnDate = null;

                if(!returnLine.equals("Not Returned")){
                    returnDate = LocalDateTime.parse(returnLine);
                }

                boolean isReturned =
                        Boolean.parseBoolean(
                                reader.readLine().split(":")[1].trim()
                        );

                reader.readLine();
                reader.readLine();

                borrowLog record =
                        new borrowLog(
                                bookID,
                                userID,
                                borrowDate,
                                returnDate,
                                isReturned
                        );

                data.borrowLogs.add(record);

        }

        reader.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for save changes of the logs
    public static void saveBorrowLogsChanges(){
        try {
            FileWriter writer =
                new FileWriter(borrowFile);

            for(borrowLog record : data.borrowLogs){

                writer.write("=".repeat(50) + "\n");
                writer.write("Book ID      : " + record.bookID + "\n");
                writer.write("User ID      : " + record.userID + "\n");
                writer.write("Borrow Date  : " + record.borrowDate + "\n");

                if(record.returnDate == null){
                    writer.write("Return Date  : Not Returned\n");
                }
                else{
                    writer.write("Return Date  : " + record.returnDate + "\n");
                }

                writer.write("Returned     : " + record.isReturned + "\n");
                writer.write("=".repeat(50) + "\n\n");

            }

            writer.close();
        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
    // for loading a admin 
    public static void loadAdminAccounts(){
        File file = new File(adminFile);

        if(!file.exists()){
            return;
        }

        try {
            BufferedReader adminReader = new BufferedReader(new FileReader(file));
            while (adminReader.ready()) {

                adminReader.readLine(); // ======

                String adminID = adminReader.readLine().split(":")[1].trim();
                String username = adminReader.readLine().split(":")[1].trim();
                String password = adminReader.readLine().split(":")[1].trim();

                adminReader.readLine(); // ======
                adminReader.readLine(); // blank line

                admin admin = new admin(adminID, username, password);

                data.admins.put(adminID, admin);
            }

            adminReader.close();

        } 
        catch(FileNotFoundException e){
            utils.error("Could not locate file location ^^");;
        }
        catch(IOException e){
            utils.error("Something went wrong");;
        }
    }
}
