package h789tienelf.repos;
import h789tienelf.model.Order;


public class OrderRepo {
    public static void addToOrder(int key){
        Order.orders.add(key);
    }

    public static void createOrder(){
        new Order();
    }
}
