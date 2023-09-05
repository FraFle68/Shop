public class Main {
    public static void main(String[] args) {
        OrderMapRepo repo1 = new OrderMapRepo();
        ShopService myFirstShop = new ShopService(repo1);

        OrderListRepo repo2 = new OrderListRepo();
        ShopService mySecondShop = new ShopService(repo2);

    }
}
