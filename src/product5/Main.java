package product5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 50.0, false, LocalDate.of(2022, 3, 15)));
        products.add(new Product("Book", 80.0, true, LocalDate.of(2022, 5, 20)));
        products.add(new Product("Electronics", 70.0, false, LocalDate.of(2022, 1, 10)));

        double totalCost = products.stream()
                .filter(product -> product.getDateAdded().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Total cost of eligible products: $" + totalCost);
    }
}
