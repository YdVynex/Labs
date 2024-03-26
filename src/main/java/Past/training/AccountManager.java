package Past.training;
import Past.training.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    public List<Account> bankAccounts = new ArrayList<>();
    public boolean add(Account i){
        bankAccounts.add(i);
        return false;
    }
}
