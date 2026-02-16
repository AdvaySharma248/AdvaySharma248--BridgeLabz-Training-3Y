public class Order {
    String productName;
    int quantity;
    double price;

    public Order(String productName, int quantity, double price) throws InvalidOrderException {
        if (quantity < 0 || price < 0) {
            throw new InvalidOrderException("Quantity or price cannot be negative");
        }
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }
}
