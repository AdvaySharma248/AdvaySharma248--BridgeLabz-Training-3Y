import java.util.Arrays;

public class Flight {
    String flightNumber;
    String destination;
    String departureTime;
    int seatsAvailable;
    boolean[] seats;

    public Flight(String flightNumber, String destination, String departureTime, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seatsAvailable = totalSeats;
        this.seats = new boolean[totalSeats];
        Arrays.fill(this.seats, true);
    }

    public void display() {
        System.out.println(flightNumber + " | " + destination + " | " + departureTime + " | Seats Available: " + seatsAvailable);
    }

    public void reserveSeat() throws FlightFullException {
        if (seatsAvailable <= 0) throw new FlightFullException("Flight fully booked");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                seats[i] = false;
                seatsAvailable--;
                System.out.println("Seat reserved. Seat number: " + (i+1));
                return;
            }
        }
    }

    public void cancelReservation(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number");
            return;
        }
        if (!seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            seatsAvailable++;
            System.out.println("Reservation canceled for seat " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " was not booked");
        }
    }
}
