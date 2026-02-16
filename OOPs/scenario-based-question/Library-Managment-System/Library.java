import java.util.*;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void searchBook(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                b.display();
            }
        }
    }

    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (b.available) {
                    b.available = false;
                    System.out.println("Book checked out: " + b.title);
                    return;
                } else {
                    throw new BookNotAvailableException("Book is already checked out");
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (Book b : books) {
            b.display();
        }
    }
}
