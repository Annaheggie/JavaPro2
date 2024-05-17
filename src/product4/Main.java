package product4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Electronics", 599.99, true, LocalDateTime.now().minusDays(3)));
        products.add(new Product("Clothing", 49.99, false, LocalDateTime.now().minusDays(1)));
        products.add(new Product("Books", 19.99, true, LocalDateTime.now()));

        List<Product> lastThreeAddedProducts = products.stream()
                .sorted((p1, p2) -> p2.getDateAdded().compareTo(p1.getDateAdded()))
                .limit(3)
                .toList();

        lastThreeAddedProducts.forEach(product -> System.out.println("Type: " + product.getType() +
                ", Price: $" + product.getPrice() +
                ", Discount: " + (product.hasDiscount() ? "Yes" : "No") +
                ", Date Added: " + product.getDateAdded()));
    }
}
