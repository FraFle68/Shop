import java.math.BigDecimal;

public record Product(
        String idCode,
        String name,
        BigDecimal purchasingPrice,
        BigDecimal sellingPrice) {
}
