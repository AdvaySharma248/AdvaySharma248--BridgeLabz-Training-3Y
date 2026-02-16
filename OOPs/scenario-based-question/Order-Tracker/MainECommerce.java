import java.util.*;

public class MainECommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ECommerce ec = new ECommerce();

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Order " + (i + 1) + ":");
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            try {
                Order o = new Order(name, qty, price);
                ec.addOrder(o);
            } catch (InvalidOrderException e) {
                System.out.println("Invalid order: " + e.getMessage());
            }
        }

        while (true) {
            System.out.println("\n1. Daily Summary\n2. Product-wise total\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                ec.dailySummary();
            } else if (choice == 2) {
                System.out.print("Enter product keyword: ");
                String key = sc.nextLine();
                ec.productWiseTotal(key);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
