// Order.java

public class Order {
    private int orderId;
    private Product product;
    private Customer customer;
    private int quantity;

    public Order(int orderId, Product product, Customer customer, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        product.displayInfo();
        customer.displayInfo();
        System.out.println("Quantity: " + quantity);
    }
}
