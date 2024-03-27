package h6;

import java.util.Arrays;

public class ArrayEditor {

    private long[] x;
    public ArrayEditor(long[] x){
        this.x = x;
    }
    public void increase(){
        int newLength = x.length * 2;
        long[] newArray = new long[newLength];
        System.arraycopy(x, 0, newArray, 0, x.length);
        System.out.println(Arrays.toString(newArray));
    }

    public void multiply(int multiplier){
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * multiplier;
        }
        System.out.println(Arrays.toString(x));
    }
}
