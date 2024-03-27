package h5;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    private final int i;
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
}