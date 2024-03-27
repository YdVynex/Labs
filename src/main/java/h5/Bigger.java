package h5;

public class Bigger {
    private int x;
    private int y;

    public Bigger(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int greatest(){
        if(x < y){
            System.out.println("y is greater than x");
        } else {
            return x;
        }
        if (y < x){
            System.out.println("x is greater than y");
        } else {
            return y;
        }
        return 0;
    }
}
