import java.util.*;

public class MainProductCatalog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductCatalog catalog = new ProductCatalog();

        while (true) {
            System.out.println("\n1. Add product\n2. Search product\n3. Update stock\n4. Generate report\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Product name: ");
                String name = sc.nextLine();
                System.out.print("Category: ");
                String category = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                try {
                    Product p = new Product(name, category, price, stock);
                    catalog.addProduct(p);
                } catch (InvalidStockException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 2) {
                System.out.print("Enter keyword to search: ");
                String key = sc.nextLine();
                catalog.searchProduct(key);
            } else if (choice == 3) {
                System.out.print("Enter product name to update stock: ");
                String name = sc.nextLine();
                System.out.print("Enter new stock value: ");
                int newStock = sc.nextInt();
                sc.nextLine();
                catalog.updateStock(name, newStock);
            } else if (choice == 4) {
                System.out.print("Sort by price ascending? (true/false): ");
                boolean asc = sc.nextBoolean();
                sc.nextLine();
                catalog.generateReport(asc);
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
