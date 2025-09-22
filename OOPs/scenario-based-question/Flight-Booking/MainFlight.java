import java.util.*;
public class MainFlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flight[] flightArray = {
                new Flight("AI101", "Delhi", "Mumbai", 3),
                new Flight("AI102", "Delhi", "Bangalore", 2),
                new Flight("AI103", "Mumbai", "Chennai", 1)
        };

        FlightSystem system = new FlightSystem(flightArray);

        while (true) {
            System.out.println("\n1. Display all flights\n2. Search flight\n3. Book flight\n4. View bookings\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                for (Flight f : flightArray) f.display();
            } else if (choice == 2) {
                System.out.print("Enter keyword to search: ");
                String key = sc.nextLine();
                system.searchFlight(key);
            } else if (choice == 3) {
                System.out.print("Enter flight number: ");
                String fn = sc.nextLine();
                System.out.print("Enter passenger name: ");
                String name = sc.nextLine();
                system.bookFlight(fn, name);
            } else if (choice == 4) {
                system.displayBookings();
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
