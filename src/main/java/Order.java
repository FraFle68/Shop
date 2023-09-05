import java.util.ArrayList;
import java.util.List;

public record Order(
        int orderNumber,
        String clientId,
        List<Product> products) {
}
