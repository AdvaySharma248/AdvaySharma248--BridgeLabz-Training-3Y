import java.util.*;

public class BookBuddy {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String title, String author) throws InvalidBookFormatException {
        if (title == null || author == null || title.trim().isEmpty() || author.trim().isEmpty()) {
            throw new InvalidBookFormatException("Invalid book format: Title or Author missing.");
        }
        books.add(title.trim() + " - " + author.trim());
    }

    public void sortBooksAlphabetically() {
        Collections.sort(books, String.CASE_INSENSITIVE_ORDER);
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (String book : books) {
            String[] parts = book.split(" - ");
            if (parts.length == 2 && parts[1].equalsIgnoreCase(author)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    public void displayBooks() {
        try {
            if (books.isEmpty()) throw new Exception("Bookshelf is empty.");
            for (String book : books) {
                System.out.println(book);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void exportBooks() {
        String[] bookArray = books.toArray(new String[0]);
        System.out.println("\nExported Books:");
        for (String b : bookArray) {
            System.out.println(b);
        }
    }
}
