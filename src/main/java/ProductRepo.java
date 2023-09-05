import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productRepo = new ArrayList<>();

    public boolean addProduct(Product product) {
        return productRepo.add(product);
    }

    public boolean deleteProduct(String productId) {
        return productRepo.remove(getProductById(productId));
    }

    public Product getProductById(String productId) {
        for(Product listedProduct : productRepo) {
            if(listedProduct.idCode().equals(productId)) {
                return listedProduct;
            }
        }
        return null;
    }

    public List<Product> getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(List<Product> productRepo) {
        this.productRepo = productRepo;
    }
}
