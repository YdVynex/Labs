package h5;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    private int i;
    public Factorial(int i) {
        this.i = i;
    }
    public void calculate() {
        int sum = 1;
        for (int u = 1; u < i + 1; u++) {
            sum = (sum * u);
        }
        System.out.println(sum);
    }
    public int cRecursion(int x){
        int a = 1;
        if(x != 0){
            a = x * cRecursion(--x);
        }
        return a;
    }
}