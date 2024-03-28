package h7.repos;

import h7.model.Account;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static h7.model.Item.itemList;


public class AccountRepo implements Iterable {
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
    @Override
    public Iterator<Account> iterator() {
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < accountList.size();
            }
            @Override
            public Account next() {
                return accountList.get(index++);
            }
        };
    }
}
