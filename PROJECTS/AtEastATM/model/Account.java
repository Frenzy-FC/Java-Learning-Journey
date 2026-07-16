package PROJECTS.AtEastATM.model;

import java.util.ArrayList;
// account model
public class Account {
    public String fullName;
    public String username;
    public int pin;
    public double deposit;
    // transaction history
    public ArrayList<Transaction> history = new ArrayList<>();
    // account constructor
    public Account(String fullName, String username, int pin, double deposit){
        this.fullName = fullName;
        this.username = username;
        this.pin = pin;
        this.deposit = deposit;
    }
}
