package PROJECTS.AtEastATM.model;
import java.time.LocalDateTime;
// transaction model
public class Transaction {
    public String type;
    public double amount;
    public double newbalance;
    public LocalDateTime date;
    
    // For storing transactions/constructor
    public Transaction(String type, double amount, double newbalance){
        this.type = type;
        this.amount = amount;
        this.newbalance = newbalance;
        this.date = LocalDateTime.now();
    }
}
