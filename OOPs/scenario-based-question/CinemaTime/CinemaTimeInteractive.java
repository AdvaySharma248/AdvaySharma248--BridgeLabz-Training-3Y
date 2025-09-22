import java.util.*;

public class CinemaTimeInteractive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CinemaTime manager = new CinemaTime();
        boolean running = true;

        while (running) {
            System.out.println("\n--- CinemaTime Menu ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter movie title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter showtime (HH:MM): ");
                        String time = sc.nextLine();
                        manager.addMovie(title, time);
                        System.out.println("Movie added: " + title + " - " + time);
                        break;
                    case 2:
                        System.out.print("Enter keyword to search: ");
                        String keyword = sc.nextLine();
                        manager.searchMovie(keyword);
                        break;
                    case 3:
                        manager.displayAllMovies();
                        break;
                    case 4:
                        manager.generateReport();
                        break;
                    case 5:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (InvalidTimeFormatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index.");
            }
        }
        sc.close();
    }
}
