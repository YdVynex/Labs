package h4;

public class Main {
    public static void main(String[] args) {
        ElevenProof e = new ElevenProof("103050108");
        e.action();
        printTable p = new printTable(5);
        p.makeTable();
    }
}
