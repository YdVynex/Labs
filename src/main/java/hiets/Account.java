package hiets;
import java.sql.*;

public class Account {
    private int id;
    private int balance;
    private int interest;

    public Account(int id, int x, int y) {
        this.id = id;
        this.balance = x;
        this.interest = y;
    }
    public int getAccountid(){
        return id;
    }
    public int getAccountBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "id: " + id + ", " + "Balance: " + balance + ", " + "Interest: " + interest + ".";
    }
    public void withdrawMoney(int y) {
        this.balance = balance - y;
        System.out.println("New balance:");
        System.out.println(balance);
    }
}
