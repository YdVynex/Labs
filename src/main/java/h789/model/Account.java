package h789.model;

import java.util.ArrayList;

public class Account {
    private final String name;
    private final String residence;
    public final int ID;
    private final String gender;

    public ArrayList<Integer> listOrders = new ArrayList<Integer>();

    public Account(String naam){
        name = naam;
        residence = null;
        gender = null;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }
    public Account(String naam, String plaats){
        name = naam;
        residence = plaats;
        gender = null;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }
    public Account(String naam, String plaats, String Gender){
        name = naam;
        residence = plaats;
        gender = Gender;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }

    @Override
    public String toString(){
        System.out.println(name + "(" + residence + ")" + " is a " + gender);
        return null;
    }

    @Override
    public boolean equals(Object a){
        if(a == this){return true;}

        if(a instanceof Account acc) {
            if (acc.name.equals(this.name) && acc.gender == this.gender && acc.ID == this.ID) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        double hashCodeName = name.hashCode();
        double hashCodeGender = gender.hashCode();
        double hashCodeTotal = hashCodeGender * hashCodeName;
        System.out.println(hashCodeTotal);
        return 0;
    }

    @Override
    public void finalize(){
        System.out.println("HET DOET IETS");
    }
}
