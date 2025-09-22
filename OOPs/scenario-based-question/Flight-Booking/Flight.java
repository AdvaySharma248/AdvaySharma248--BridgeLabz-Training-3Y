public class Flight {
    String flightNumber;
    String origin;
    String destination;
    int seatsAvailable;

    public Flight(String flightNumber, String origin, String destination, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    public void display() {
        System.out.println(flightNumber + " | " + origin + " -> " + destination + " | Seats: " + seatsAvailable);
    }
}
