package h789tienelf.repos;

import h789tienelf.model.Webshop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static h789tienelf.model.Item.*;


public class ItemRepo {
    public static void searchItem(String webshop, int key) {
        if (webshop == Webshop.webshopName) {
            System.out.println("From " + Webshop.webshopName + ":");
            System.out.println(itemList.get(key));
        }
    }

    public static void sortOrder(String webshop) {
        if (webshop == Webshop.webshopName) {
            ArrayList valueList = new ArrayList<>(dateList.size());
            valueList.addAll(dateList.values());
            Collections.sort(valueList, new Comparator<String>() {
                DateFormat f = new SimpleDateFormat("d MMM yyyy");

                @Override
                public int compare(String o1, String o2) {
                    try {
                        return f.parse(o1).compareTo(f.parse(o2));
                    } catch (ParseException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            });
            System.out.println("Dates of all items sorted:");
            for (int i = 0; i < dateList.size(); i++) {
                System.out.println(valueList.get(i));
            }
        }
    }
}
