public class ShopService {
    ProductRepo myProducts = new ProductRepo();
    OrderRepo myOrderList;

    public ShopService(OrderRepo repo) {
        myOrderList = repo;
    };
    public boolean makeOrder(Order order) {
        for(Product product : order.products()) {
            if(!myProducts.getProductRepo().contains(product)){
                return false;
            }
        }
        myOrderList.addOrder(order);
        return true;
    }
}
