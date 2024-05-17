package product2;

import java.util.List;
import java.util.stream.Collectors;


public class ProductStreamExample {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Book", 1.0, true),
                new Product("Book", 2.0, false),
                new Product("Electronics", 100.0, true),
                new Product("Book", 5.0, true)
        );

        List<Product> discountedBooks = products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount())
                .peek(product -> product.price *= 0.9)
                .collect(Collectors.toList());

        discountedBooks.forEach(product -> System.out.println("Type: " + product.getType() + ", Price: " + product.getPrice()));
    }
}

