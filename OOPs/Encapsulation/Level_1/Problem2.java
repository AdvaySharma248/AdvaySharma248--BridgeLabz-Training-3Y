public class Problem2 {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Electronics(101, "Phone", 20000),
            new Clothing(201, "T-Shirt", 500),
            new Groceries(301, "Rice", 1200)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " -> Price: " + p.getPrice() + ", Tax: " + tax + ", Discount: " + discount + ", Final: " + finalPrice);
        }
    }
}

abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int id, String name, double price) {
        this.productId = id; this.name = name; this.price = price;
    }
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double p) { this.price = p; }
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id,name,price); }
    @Override
    public double calculateDiscount() { return getPrice() * 0.05; } // 5% discount
    @Override
    public double calculateTax() { return getPrice() * 0.18; } // 18% tax
    @Override
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id,name,price); }
    @Override
    public double calculateDiscount() { return 100; } // flat
    @Override
    public double calculateTax() { return getPrice() * 0.05; } // 5%
    @Override
    public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id,name,price); }
    @Override
    public double calculateDiscount() { return getPrice() * 0.02; } // 2%
}
