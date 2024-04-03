package h789tienelf.model;

public class Android extends Human implements Chargeable {

    public final String name = "Android 17";
    public static int level = 0;

    public Android(String naam) {
        super(naam);
    }

    public void greet(){
        System.out.println("I'm only half human, but human still... My energy level is " + level + "%");
    }
}
