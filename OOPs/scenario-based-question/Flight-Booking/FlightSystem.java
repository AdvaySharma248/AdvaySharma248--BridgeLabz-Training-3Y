import java.util.*;

public class FlightSystem {
    Flight[] flights;
    List<Booking> bookings;

    public FlightSystem(Flight[] flights) {
        this.flights = flights;
        bookings = new ArrayList<>();
    }

    public void searchFlight(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Flight f : flights) {
            if (f.flightNumber.toLowerCase().contains(keyword.toLowerCase()) ||
                    f.origin.toLowerCase().contains(keyword.toLowerCase()) ||
                    f.destination.toLowerCase().contains(keyword.toLowerCase())) {
                f.display();
            }
        }
    }

    public void bookFlight(String flightNumber, String passengerName) {
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber)) {
                if (f.seatsAvailable > 0) {
                    f.seatsAvailable--;
                    bookings.add(new Booking(flightNumber, passengerName));
                    System.out.println(passengerName + " successfully booked on " + flightNumber);
                } else {
                    System.out.println("Flight full: " + flightNumber);
                }
                return;
            }
        }
        System.out.println("Flight not found: " + flightNumber);
    }

    public void displayBookings() {
        System.out.println("All Bookings:");
        for (Booking b : bookings) {
            b.display();
        }
    }
}
