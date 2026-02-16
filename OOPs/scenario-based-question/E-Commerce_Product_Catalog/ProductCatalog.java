import java.util.*;

public class ProductCatalog {
    List<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added: " + p.name);
    }

    public void searchProduct(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Product p : products) {
            if (p.name.toLowerCase().contains(keyword.toLowerCase()) ||
                    p.category.toLowerCase().contains(keyword.toLowerCase())) {
                p.display();
            }
        }
    }

    public void updateStock(String name, int newStock) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                try {
                    if (newStock < 0 || newStock > 1000) throw new InvalidStockException("Invalid stock value");
                    p.stock = newStock;
                    System.out.println("Stock updated for " + p.name + ": " + p.stock);
                } catch (InvalidStockException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    public void generateReport(boolean ascending) {
        products.sort((p1, p2) -> ascending ? Double.compare(p1.price, p2.price) : Double.compare(p2.price, p1.price));
        System.out.println("Product Report:");
        for (Product p : products) p.display();
    }
}
