import java.util.*;

public class BookBuddyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookBuddy shelf = new BookBuddy();
        boolean running = true;

        while (running) {
            System.out.println("\n--- BookBuddy Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Sort Books Alphabetically");
            System.out.println("4. Search by Author");
            System.out.println("5. Export Books");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        shelf.addBook(title, author);
                        System.out.println("Book added.");
                        break;
                    case 2:
                        shelf.displayBooks();
                        break;
                    case 3:
                        shelf.sortBooksAlphabetically();
                        System.out.println("Books sorted.");
                        break;
                    case 4:
                        System.out.print("Enter Author to search: ");
                        String searchAuthor = sc.nextLine();
                        shelf.searchByAuthor(searchAuthor);
                        break;
                    case 5:
                        shelf.exportBooks();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InvalidBookFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
