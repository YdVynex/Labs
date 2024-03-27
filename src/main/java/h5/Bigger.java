package h5;

public class Bigger {
    private final int x;
    private final int y;

    public Bigger(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int greatest(){
        if(x < y){
            System.out.println("y is greater than x");
            return y;
        } else {
            System.out.println("x is greater than y");
            return x;
        }
    }
}
