package utjavalabs;
public class MyMath {
    public static int fib(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        for (int i = 1; i <= n; i++){
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        throw new Error("Missing implementation");
    } }