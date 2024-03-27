package h5;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    private final int i;
    private List<Integer> factorialTotal = new ArrayList<>();

    private int sum = 0;

    public Factorial(int i) {
        this.i = i;
    }

    public void calculate() {
        int temp = 1;
        for (int u = 1; u < i + 1; u++) {
            int part = (temp * (u));
            if (part == 0) {
                part = 1;
            } else {
                temp = part;
            }
        }
        System.out.println(temp);
    }
}