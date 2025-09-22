import java.util.*;

public class FlightReservationSystem {
    List<Flight> flights;

    public FlightReservationSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight f) {
        flights.add(f);
        System.out.println("Flight added: " + f.flightNumber);
    }

    public void searchFlight(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(keyword) ||
                    f.destination.toLowerCase().contains(keyword.toLowerCase()) ||
                    f.departureTime.contains(keyword)) {
                f.display();
            }
        }
    }

    public Flight getFlight(String flightNumber) {
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber)) return f;
        }
        System.out.println("Flight not found: " + flightNumber);
        return null;
    }
}
