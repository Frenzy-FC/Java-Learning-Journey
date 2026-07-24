package PROJECTS.AtEastLBS.model;

public class book {
    public String bookID;
    public String bookTitle;
    public String bookAuthor;
    public String bookCat;
    public int yearPub;
    public boolean isAvailable;

    public book(String bookID, String bookTitle, String bookAuthor, String bookCat, int yearPub, boolean isAvailable){
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookCat = bookCat;
        this.yearPub = yearPub;
        this.isAvailable = isAvailable;
    }

    
    
}
