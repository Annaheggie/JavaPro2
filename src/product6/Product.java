package product6;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate createDate;

    public Product(int id, String type, double price, boolean discount, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book", 100, false, LocalDate.of(2022, 1, 1)));
        products.add(new Product(2, "Toy", 200, true, LocalDate.of(2022, 10, 10)));
        products.add(new Product(3, "Book", 150, true, LocalDate.of(2022, 5, 5)));

        Map<String, List<Product>> groupedProducts = products.stream()
                .collect(Collectors.groupingBy(Product::getType));

        groupedProducts.forEach((type, productList) -> {
            System.out.println(type + ":");
            productList.forEach(product -> System.out.println(product.getType() + ", price: " + product.price +
                    ", discount: " + product.discount + ", createDate: " + product.createDate));
        });
    }
}

