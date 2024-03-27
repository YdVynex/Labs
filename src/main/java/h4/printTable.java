package h4;

public class printTable {
    private final int number;

    public printTable(int number) {
        this.number = number;
    }

    public int makeTable() {
        for (int i = 1; i < 11; i++) {
            int answer = number * i;
            System.out.println(i + " x " + number + " = " + answer);
        }

        return 0;
    }
}