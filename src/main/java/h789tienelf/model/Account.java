package h789tienelf.model;

import h12.MyAnnotation;
import h12.MyAnnotation2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Account {
    private final String name;
    private final String residence;
    public final int ID;
    private final String gender;

    public ArrayList<Integer> listOrders = new ArrayList<Integer>();
    public static HashSet<Double> hashes = new HashSet<>();

    public Account(String naam) {
        name = naam;
        residence = null;
        gender = null;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }

    public Account(String naam, String plaats) {
        name = naam;
        residence = plaats;
        gender = null;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }

    public Account(String naam, String plaats, String Gender) {
        name = naam;
        residence = plaats;
        gender = Gender;
        ID = (int) ((double) Math.random() * 100000);
        System.out.println("Order ID created:");
        System.out.println(ID);
    }

    @Override
    public String toString() {
        System.out.println(name + "(" + residence + ")" + " is a " + gender);
        return null;
    }

    @Override
    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }

        if (a instanceof Account acc) {
            if (acc.name.equals(this.name) && acc.gender == this.gender && acc.ID == this.ID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        double hashCodeName = name.hashCode();
        double hashCodeGender = gender.hashCode();
        double hashCodeTotal = hashCodeGender * hashCodeName;
        hashes.add(hashCodeName);
        System.out.println("Total is: " + hashCodeTotal);
        System.out.println("Name is: " + hashCodeName);
        return 1;
    }
    public void giveAllHashCodes(){
        System.out.println("All HashCodes: ");
        System.out.println(hashes);
    }


    @Override
    public void finalize() {
        System.out.println("HET DOET IETS");
    }

    @MyAnnotation
    public static class HistoryRecord {
        public String description;

        public HistoryRecord(String s) {
            description = s;
        }

        @Override
        public String toString() {
            ;
            return description;
        }
        public ArrayList<String> history = new ArrayList<String>();

        @MyAnnotation2
        public void addHistory(String descr) {
            history.add(descr);
            int positie = history.size() - 1;
            System.out.println("History description added! Position of description is: " + positie);
        }
        @MyAnnotation
        public void printHistory() {
            System.out.println(history.toString());
        }

        public Human createSubHuman() {
            return new Human("Subhuman") {
                @Override
                public void greet() {
                    System.out.println("Sub is the best");
                }
            };
        }
    }
    public void getAnnotations(){
        Method[] methodes = Account.HistoryRecord.class.getMethods();
        for(Method i : methodes){
            System.out.println(i.getName()+ " " + Arrays.toString(i.getAnnotations()));
        }
    }
}


