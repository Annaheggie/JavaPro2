

import coffee.order.CoffeeOrderBoard;

import java.util.Scanner;

public void main (String[] args) {
    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Enter your choice: \n1. Add Order \n2. Deliver Next Order \n3. Deliver Specific Order \n4. Display Orders \n5. Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter customer name: ");
                String customerName = scanner.next();
                coffeeOrderBoard.add(customerName);
                break;
            case 2:
                coffeeOrderBoard.deliver();
                break;
            case 3:
                System.out.println("Enter order number to deliver: ");
                int orderNum = scanner.nextInt();
                coffeeOrderBoard.deliver(orderNum);
                break;
            case 4:
                coffeeOrderBoard.draw();
                break;
            case 5:
                System.out.println("Exiting program.");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
