import java.util.Scanner;

public class Product {

    private static double discount = 0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0.0 && newDiscount <= 100.0) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
        }
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        } else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter discount percentage for all products: ");
        double newDiscount = scanner.nextDouble();
        Product.updateDiscount(newDiscount);
        scanner.nextLine();

        System.out.println("\n--- Enter Details for Product 1 ---");
        System.out.print("Enter Product ID: ");
        String id1 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        int quant1 = scanner.nextInt();
        scanner.nextLine();
        Product product1 = new Product(id1, name1, price1, quant1);

        System.out.println("\n--- Enter Details for Product 2 ---");
        System.out.print("Enter Product ID: ");
        String id2 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        int quant2 = scanner.nextInt();
        scanner.nextLine();
        Product product2 = new Product(id2, name2, price2, quant2);

        System.out.println("\n--- Product 1 Details ---");
        product1.displayProductDetails();
        System.out.println();
        System.out.println("--- Product 2 Details ---");
        product2.displayProductDetails();
        
        scanner.close();
    }
}
