import java.util.*;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] bookArray = {
                new Book("Java Basics", "Alice"),
                new Book("Data Structures", "Bob"),
                new Book("Python for Beginners", "Charlie"),
                new Book("Algorithms", "David")
        };

        Library lib = new Library(bookArray);

        while (true) {
            System.out.println("\n1. Display all books\n2. Search book\n3. Checkout book\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                lib.displayAllBooks();
            } else if (choice == 2) {
                System.out.print("Enter keyword to search: ");
                String key = sc.nextLine();
                lib.searchBook(key);
            } else if (choice == 3) {
                System.out.print("Enter title to checkout: ");
                String title = sc.nextLine();
                try {
                    lib.checkoutBook(title);
                } catch (BookNotAvailableException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
