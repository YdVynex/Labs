package h789tienelf.model;

import static h789tienelf.model.Item.*;


public class Webshop {
    public static String webshopName;
    public static void createDummy(String shop){
        webshopName = shop;
        dummyItems();
        dummyDate();
        dummyDesc();
        dummyPrice();
    }
}

