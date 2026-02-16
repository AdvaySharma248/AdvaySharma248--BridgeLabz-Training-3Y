import java.util.Scanner;

public class MovieTicket {
	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;

	MovieTicket(String movieName) {
		this.movieName = movieName;
		this.seatNumber = "Not Assigned";
		this.price = 0.0;
		this.isBooked = false;
	}

	public void bookTicket(String seatNumber, double price) {
		if (isBooked) {
			System.err.println("Sorry, this ticket has already been booked!");
		} else {
			this.seatNumber = seatNumber;
			this.price = price;
			this.isBooked = true;
			System.out.println("\n✅ Ticket booked successfully!");
		}
	}

	public void displayTicket() {
		System.out.println("\n--- Ticket Details ---");
		System.out.println("Movie: " + this.movieName);
		if (this.isBooked) {
			System.out.println("Seat Number: " + this.seatNumber);
			System.out.println("Price: $" + this.price);
			System.out.println("Status: Booked");
		} else {
			System.out.println("Status: Not Booked Yet");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the movie name: ");
		String movie = scanner.nextLine();
		
		MovieTicket ticket = new MovieTicket(movie);
		ticket.displayTicket(); 
		
		System.out.print("\nEnter seat number to book (e.g., F5): ");
		String seat = scanner.nextLine();
		
		System.out.print("Enter the price: ");
		double price = scanner.nextDouble();
		
		ticket.bookTicket(seat, price);
		ticket.displayTicket();
		
		scanner.close();
	}
}