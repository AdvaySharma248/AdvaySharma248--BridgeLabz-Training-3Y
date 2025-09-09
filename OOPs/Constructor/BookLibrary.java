import java.util.Scanner;

class Book {
    public String isbn;
    protected String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void displayBookDetails() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

class EBook extends Book {
    private String format;

    public EBook(String isbn, String title, String author, String format) {
        super(isbn, title, author);
        this.format = format;
    }

    public void displayEBookDetails() {
        System.out.println("--- EBook Details ---");
        System.out.println("ISBN (from public): " + isbn);
        System.out.println("Title (from protected): " + title);
        System.out.println("Author (via public getter): " + getAuthor());
        System.out.println("Format: " + format);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a Physical Book:");
        System.out.print("ISBN: ");
        String bookIsbn = scanner.nextLine();
        System.out.print("Title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Author: ");
        String bookAuthor = scanner.nextLine();
        
        Book book = new Book(bookIsbn, bookTitle, bookAuthor);
        System.out.println("\n--- Initial Book Details ---");
        book.displayBookDetails();

        System.out.print("\nEnter a new author name to modify: ");
        String newAuthor = scanner.nextLine();
        book.setAuthor(newAuthor);

        System.out.println("\n--- Updated Book Details ---");
        System.out.println("Author is now: " + book.getAuthor());

        System.out.println("\nEnter details for an EBook:");
        System.out.print("ISBN: ");
        String eBookIsbn = scanner.nextLine();
        System.out.print("Title: ");
        String eBookTitle = scanner.nextLine();
        System.out.print("Author: ");
        String eBookAuthor = scanner.nextLine();
        System.out.print("Format (e.g., PDF, EPUB): ");
        String format = scanner.nextLine();

        EBook eBook = new EBook(eBookIsbn, eBookTitle, eBookAuthor, format);
        System.out.println();
        eBook.displayEBookDetails();
        
        scanner.close();
    }
}
