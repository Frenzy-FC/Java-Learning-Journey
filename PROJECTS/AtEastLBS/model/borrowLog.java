package PROJECTS.AtEastLBS.model;

import java.time.LocalDateTime;

public class borrowLog {
    public String userID;
    public String bookID;
    public LocalDateTime borrowDate;
    public LocalDateTime returnDate;
    public boolean isReturned;

    public borrowLog(String userID, String bookID, LocalDateTime borrowDate, LocalDateTime returnDate, boolean isReturned){
        this.userID = userID;
        this.bookID = bookID;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.isReturned = isReturned;
    }
}
