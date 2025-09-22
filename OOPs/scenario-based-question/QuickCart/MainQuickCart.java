import java.util.*;

public class MainQuickCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GroceryList cart = new GroceryList();

        while (true) {
            System.out.println("\n1. Add item\n2. Remove item\n3. Display sorted list\n4. Checkout\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter item to add: ");
                String item = sc.nextLine();
                cart.addItem(item);
            } else if (choice == 2) {
                System.out.print("Enter item to remove: ");
                String item = sc.nextLine();
                try {
                    cart.removeItem(item);
                } catch (ItemNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 3) {
                cart.displaySortedList();
            } else if (choice == 4) {
                String[] finalList = cart.checkout();
                System.out.println("Final Checkout List: " + Arrays.toString(finalList));
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
