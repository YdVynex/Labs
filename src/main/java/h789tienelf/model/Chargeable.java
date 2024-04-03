package h789tienelf.model;

import static h789tienelf.model.Android.level;

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
