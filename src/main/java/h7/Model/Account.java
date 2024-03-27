package h7.Model;

import java.util.ArrayList;

public class Account {
    public static String name;
    public static String residence;
    public int ID;
    public ArrayList<Integer> listOrders = new ArrayList<Integer>();
    public Account(String naam, String plaats){
        name = naam;
        residence = plaats;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }
}
