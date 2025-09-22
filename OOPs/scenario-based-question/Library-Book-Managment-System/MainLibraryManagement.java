import java.util.*;

public class MainLibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManagement lib = new LibraryManagement();

        lib.addBook(new Book("Java Basics", "Alice", "Programming"));
        lib.addBook(new Book("Data Structures", "Bob", "Programming"));
        lib.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy"));
        lib.addBook(new Book("The Alchemist", "Paulo Coelho", "Fiction"));

        while (true) {
            System.out.println("\n1. Display all books\n2. Search book\n3. Borrow book\n4. Return book\n5. Exit");
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
                System.out.print("Enter title to borrow: ");
                String title = sc.nextLine();
                try {
                    lib.borrowBook(title);
                } catch (BookAlreadyBorrowedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 4) {
                System.out.print("Enter title to return: ");
                String title = sc.nextLine();
                lib.returnBook(title);
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
