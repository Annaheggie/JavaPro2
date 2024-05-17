package product1;

import java.util.List;
import static product1.ProductFilter.filterProducts;


class Main {

    public void main(String[] args) {
        List<Product> products = List.of(
                new Product("Book", 200),
                new Product("Book", 300),
                new Product("Electronics", 500)
        );

        List<Product> filteredProducts = filterProducts(products);

        filteredProducts.forEach(product -> System.out.println("Type: " + product.getType() + ", Price: " + product.getPrice()));

    }
}





