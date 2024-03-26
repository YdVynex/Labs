package H7.repos;
import H7.Model.Order;


public class OrderRepo {
    public static void addToOrder(int key){
        Order.orders.add(key);
    }

    public static void createOrder(){
        new Order();
    }
}
