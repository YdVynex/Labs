package h5;

public class Main {
    public static void main(String[] args) {
        Bigger b = new Bigger(5, 6);
        int number = b.greatest();
        System.out.println(number);

        Factorial f = new Factorial(5);
        f.calculate();
        int fRecursion = f.cRecursion(4);
        System.out.println(fRecursion);

        //If time permits gedeelte//
        System.out.println(" ");

        Fibo fi = new Fibo(6);
        fi.runFibo();
    }
}
