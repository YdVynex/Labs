package Past.training;

public class Bank {
    public Bank(String naam) {
        bankName = naam;
    }

    @Override
    public String toString() {
        return bankName;
    }
    public String bankName;
    //public List<Account> bankAccounts = new ArrayList<>();
    public AccountManager bankAccountsManager;

    public void setBankAccount(int id, int balance, int interest) {
        Account account = new Account(id, balance, interest);
        this.bankAccountsManager.add(account);
    }

    /*public int withdraw(int ID, int money){
        for (Account i : bankAccountsManager) {
            if (ID == i.getAccountid()) {
                return i.getAccountBalance() - money;
            } else {
                return 0;
            }
        }
        return ID;
    }
     */
    public void getInfo() {
        System.out.println(bankName);
        System.out.println(bankAccountsManager);
    }
    public void setAccounts(AccountManager a){
        bankAccountsManager = a;
    }

}

