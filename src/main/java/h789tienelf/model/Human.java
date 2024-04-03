package h789tienelf.model;

public class Human extends Person {
    public Human(String naam){
        this.name = naam;
    }
    public String name;
    public void greet(){
        System.out.println("Hello my name is " + name);
    }
}
