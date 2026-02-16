import java.util.Scanner;

public class HandBook {
	String bookTitle;
	String bookAuthor;
	double price;
	
	HandBook(String bookTitle, String bookAuthor, double price){
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}
	
	public void displayBookDetails() {
		System.out.println("\n--- Book Details ---");
		System.out.println("Title of the book: " + bookTitle);
		System.out.println("Author of the book: " + bookAuthor);
		System.out.println("Price of the book: " + price);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Book Title: ");
		String title = scanner.nextLine();
		
		System.out.print("Enter Book Author: ");
		String author = scanner.nextLine();
		
		System.out.print("Enter Book Price: ");
		double price = scanner.nextDouble();
		
		HandBook book = new HandBook(title, author, price);
		book.displayBookDetails();
		
		scanner.close();
	}
}