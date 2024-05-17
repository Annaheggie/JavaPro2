package product3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 15.99, true));
        products.add(new Product("Book", 12.50, false));
        products.add(new Product("Book", 9.99, true));
        products.add(new Product("Electronics", 299.99, false));
        products.add(new Product("Clothing", 49.99, true));

        Product cheapestBook = products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);

        System.out.println("Cheapest Book: " + cheapestBook);
    }
}

