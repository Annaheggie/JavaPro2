package product1;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    public static List<Product> filterProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

}


