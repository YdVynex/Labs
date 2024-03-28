package h789.repos;
import h789.model.Order;


public class OrderRepo {
    public static void addToOrder(int key){
        Order.orders.add(key);
    }

    public static void createOrder(){
        new Order();
    }
}
