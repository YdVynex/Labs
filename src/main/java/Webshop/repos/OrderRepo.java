package Webshop.repos;
import Webshop.Model.Order;


public class OrderRepo {
    public static void addToOrder(int key){
        Order.orders.add(key);
    }

    public static void createOrder(){
        new Order();
    }
}
