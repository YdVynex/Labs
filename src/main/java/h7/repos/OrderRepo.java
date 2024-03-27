package h7.repos;
import h7.model.Order;


public class OrderRepo {
    public static void addToOrder(int key){
        Order.orders.add(key);
    }

    public static void createOrder(){
        new Order();
    }
}
