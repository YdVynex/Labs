package h4;

import java.util.ArrayList;

public class ElevenProof {
    private final String accountNumber;

    public ElevenProof(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void action() {
        ArrayList<Integer> divisableNumber = new ArrayList<>();
        int increasingNumber = 8;
        char[] selectInt = accountNumber.toCharArray();

        for (int i = 1; i < 10; i++) {
            int select = Character.getNumericValue(selectInt[increasingNumber]);
            increasingNumber--;
            divisableNumber.add(select * (i));
        }

        int sum = 0;
        for (int num : divisableNumber) {
            sum += num;
        }

        if (sum % 11 == 0) {
            System.out.println(sum);
            System.out.println("Legit BankAccount! Divisible by 11.");
        } else {
            System.out.println(sum);
            throw new IllegalArgumentException("Not Legit BankAccount! Not Divisible by 11.");
            }
    }
}
