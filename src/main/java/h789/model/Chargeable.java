package h789.model;

import static h789.model.Android.level;

public interface Chargeable {
    public default int charge(int amount){
        if(level + amount < 100){
            level = level + amount;
        }
        else {
            System.out.println("Charge rejected");
        }
        return amount;
    }
}
