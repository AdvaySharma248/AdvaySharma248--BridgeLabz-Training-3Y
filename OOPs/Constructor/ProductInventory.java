import java.util.Scanner;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        Product.totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("--- Product Details ---");
        System.out.println("Name: " + this.productName);
        System.out.println("Price: $" + this.price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total number of products created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Creating First Product ---");
        System.out.print("Enter product name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); 
        Product p1 = new Product(name1, price1);
        p1.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println("\n--- Creating Second Product ---");
        System.out.print("Enter product name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();
        Product p2 = new Product(name2, price2);
        p2.displayProductDetails();
        Product.displayTotalProducts();
        
        scanner.close();
    }
}
