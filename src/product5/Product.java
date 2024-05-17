package product5;

import java.time.LocalDate;

class Product {
    String type;
    double price;
    boolean discount;
    LocalDate dateAdded;

    public Product(String type, double price, boolean discount, LocalDate dateAdded) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return discount;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
