// ShoppingSystem.java

public class ShoppingSystem {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Smartphone", 499.99);

        // Create customers
        Customer customer1 = new Customer(101, "Alice", "alice@example.com");
        Customer customer2 = new Customer(102, "Bob", "bob@example.com");

        // Create orders
        Order order1 = new Order(1001, product1, customer1, 2);
        Order order2 = new Order(1002, product2, customer2, 1);

        // Display information
        System.out.println("Order Information:");
        order1.displayInfo();
        System.out.println();
        order2.displayInfo();
    }
}
