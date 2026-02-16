import java.util.Scanner;

class Book {
    private static String libraryName;
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("The object is not an instance of the Book class.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Library Name: ");
        String libName = scanner.nextLine();
        Book.setLibraryName(libName);

        System.out.println();
        Book.displayLibraryName();
        System.out.println();
        
        System.out.println("--- Enter Book Details ---");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        Book book1 = new Book(title, author, isbn);
        
        System.out.println("\n--- Book Details ---");
        book1.displayBookDetails();
        
        scanner.close();
    }
}
