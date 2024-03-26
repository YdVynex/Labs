package Webshop.Model;

import static Webshop.Model.Item.*;


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

