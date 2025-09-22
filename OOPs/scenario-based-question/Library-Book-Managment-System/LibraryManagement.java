import java.util.*;

public class LibraryManagement {
    List<Book> books;

    public LibraryManagement() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void searchBook(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase()) ||
                    b.author.toLowerCase().contains(keyword.toLowerCase()) ||
                    b.genre.toLowerCase().contains(keyword.toLowerCase())) {
                b.display();
            }
        }
    }

    public void borrowBook(String title) throws BookAlreadyBorrowedException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (b.available) {
                    b.available = false;
                    System.out.println("You borrowed: " + b.title);
                    return;
                } else {
                    throw new BookAlreadyBorrowedException("Book already borrowed");
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) {
                    b.available = true;
                    System.out.println("You returned: " + b.title);
                } else {
                    System.out.println("Book was not borrowed: " + b.title);
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (Book b : books) b.display();
    }
}
