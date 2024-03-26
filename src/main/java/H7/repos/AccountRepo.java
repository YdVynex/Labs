package H7.repos;

import H7.Model.Account;

import java.util.ArrayList;
import java.util.List;

import static H7.Model.Item.itemList;


public class AccountRepo {
    public List<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account x){
        accountList.add(x);
    }
    public void addItem(int id, int item){
        for(Account a : accountList){
            if(id == a.ID){
                for (int i = 0; i< itemList.size(); i++ ){
                  if(itemList.containsKey(item)){
                    a.listOrders.add(item);
                    break;
                }
            }
        }}
    }
    public void printOrder(int id){
        for(Account b : accountList){
        if(id == b.ID){
            System.out.println(b.listOrders);
        }
        }
    }
}
