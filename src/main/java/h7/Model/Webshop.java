package h7.Model;

import static h7.Model.Item.*;


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

