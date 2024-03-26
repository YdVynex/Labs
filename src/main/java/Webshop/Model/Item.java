package Webshop.Model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Item {
    public static HashMap<Integer,BigDecimal> priceList = new HashMap<Integer, BigDecimal>();
    public static HashMap<Integer,String> descList = new HashMap<Integer, String>();
    public static HashMap<Integer,String> dateList = new HashMap<Integer, String>();
    public static HashMap<Integer,String> itemList = new HashMap<Integer, String>();

    public static void dummyItems(){
        itemList.put(1, "Item 1");
        itemList.put(2, "Item 2");
        itemList.put(3, "Item 3");
        itemList.put(4, "Item 4");
        itemList.put(5, "Item 5");
        itemList.put(6, "Item 6");
    }
    public static void dummyPrice(){
        priceList.put(1, BigDecimal.valueOf(24.00));
        priceList.put(2, BigDecimal.valueOf(1.99));
        priceList.put(3, BigDecimal.valueOf(26.00));
        priceList.put(4, BigDecimal.valueOf(11.49));
        priceList.put(5, BigDecimal.valueOf(7.67));
        priceList.put(6, BigDecimal.valueOf(69.95));
    }
    public static void dummyDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("d MMM yyyy");
        String d1 = formatter.format(new Date(12, 7, 30));
        dateList.put(1, d1);

        String d2 = formatter.format(new Date(125, 2, 1));
        dateList.put(2, d2);

        String d3 = formatter.format(new Date(44, 3, 31));
        dateList.put(3, d3);

        String d4 = formatter.format(new Date(206, 1, 12));
        dateList.put(4, d4);

        String d5 = formatter.format(new Date(177, 11, 22));
        dateList.put(5, d5);

        String d6 = formatter.format(new Date(101, 6, 14));
        dateList.put(6, d6);

    }
    public static void dummyDesc(){
        descList.put(1, "Item1: Potlood");
        descList.put(2, "Item2: Noodles");
        descList.put(3, "Item3: Laptop");
        descList.put(4, "Item4: Schoenen");
        descList.put(5, "Item5: Pen");
        descList.put(6, "Item6: Mobiel");
    }

}
