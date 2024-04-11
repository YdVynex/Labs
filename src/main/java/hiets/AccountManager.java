package hiets;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    public List<Account> bankAccounts = new ArrayList<>();
    public Object setString;

    public boolean add(Account i){
        bankAccounts.add(i);
        return false;
    }

    public void setString(String capture) {
    }
}
