public interface OrderRepo {
    public boolean addOrder(Order order);
    public boolean deleteOrder(int orderNumber);
    public Order getOrderByOrderNumber(int orderNumber);
}
