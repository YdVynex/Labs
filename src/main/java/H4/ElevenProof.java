package H4;

import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class ElevenProof {
    private final String accountNumber;

    public ElevenProof(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int action() {
        ArrayList<Integer> divisableNumber = new ArrayList<>();
        int increasingNumber = -1;
        char[] selectInt = accountNumber.toCharArray();
        for (int i = 8; i > 0; i--) {
            ++increasingNumber;
            int select = Character.getNumericValue(selectInt[increasingNumber]);
            divisableNumber.add(select * (i+1));
        }
        int sum = 0;
        for (int num : divisableNumber) {
            sum += num;
        }
        if (sum % 11 == 0) {
            System.out.println(sum);
            System.out.println("Legit BankAccount!");
        } else {
            System.out.println(sum);
            System.out.println("Not legit BankAccount!");
            ;
        }
        return sum;
    }
}
