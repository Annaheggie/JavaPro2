package coffee.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CoffeeOrderBoard {
    private List<Order> orders = new ArrayList<>();
    private int lastOrderNumber = 0;

    public void add(String customerName) {
        Order newOrder = new Order(++lastOrderNumber, customerName);
        orders.add(newOrder);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.get(0);
            System.out.println("Delivering order: " + nextOrder.getOrderNumber() + " | " + nextOrder.getCustomerName());
            orders.remove(0);
        } else {
            System.out.println("No orders in the queue.");
        }
    }

    public void deliver(int orderNumber) {
        for (Order order : orders) {
            if (Objects.equals(order.getOrderNumber(), String.valueOf(orderNumber))) {
                System.out.println("Delivering order: " + order.getOrderNumber() + " | " + order.getCustomerName());
                orders.remove(order);
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public void draw() {
        System.out.println("============= \nNum | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}
