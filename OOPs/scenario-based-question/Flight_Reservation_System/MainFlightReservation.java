import java.util.*;

public class MainFlightReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightReservationSystem system = new FlightReservationSystem();

        system.addFlight(new Flight("AI101", "Mumbai", "10:00AM", 3));
        system.addFlight(new Flight("AI102", "Delhi", "02:00PM", 2));
        system.addFlight(new Flight("AI103", "Bangalore", "06:00PM", 1));

        while (true) {
            System.out.println("\n1. Display all flights\n2. Search flight\n3. Reserve seat\n4. Cancel reservation\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                for (Flight f : system.flights) f.display();
            } else if (choice == 2) {
                System.out.print("Enter keyword to search: ");
                String key = sc.nextLine();
                system.searchFlight(key);
            } else if (choice == 3) {
                System.out.print("Enter flight number to reserve: ");
                String fn = sc.nextLine();
                Flight f = system.getFlight(fn);
                if (f != null) {
                    try {
                        f.reserveSeat();
                    } catch (FlightFullException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            } else if (choice == 4) {
                System.out.print("Enter flight number to cancel reservation: ");
                String fn = sc.nextLine();
                Flight f = system.getFlight(fn);
                if (f != null) {
                    System.out.print("Enter seat number to cancel: ");
                    int seat = sc.nextInt();
                    sc.nextLine();
                    f.cancelReservation(seat);
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
