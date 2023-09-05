import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo{
    List<Order> orderList = new ArrayList<>();

    public boolean addOrder(Order order) {
        return orderList.add(order);
    }

    public boolean deleteOrder(int orderNumber) {
        return orderList.remove(getOrderByOrderNumber(orderNumber));
    }

    public Order getOrderByOrderNumber(int orderNumber) {
        for(Order listedOrder : orderList) {
            if(listedOrder.orderNumber() == orderNumber) {
                return listedOrder;
            }
        }
        return null;
    }
}
