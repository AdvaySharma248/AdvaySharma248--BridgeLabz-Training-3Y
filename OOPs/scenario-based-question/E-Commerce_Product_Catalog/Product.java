public class Product {
    String name;
    String category;
    double price;
    int stock;

    public Product(String name, String category, double price, int stock) throws InvalidStockException {
        if (stock < 0 || stock > 1000) throw new InvalidStockException("Stock must be between 0 and 1000");
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println(name + " | " + category + " | Price: " + price + " | Stock: " + stock);
    }
}
