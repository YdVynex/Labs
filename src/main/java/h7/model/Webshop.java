package h7.model;

import static h7.model.Item.*;


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

