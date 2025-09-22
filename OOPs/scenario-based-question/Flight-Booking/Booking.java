public class Booking {
    String flightNumber;
    String passengerName;

    public Booking(String flightNumber, String passengerName) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
    }

    public void display() {
        System.out.println(passengerName + " booked on flight " + flightNumber);
    }
}
