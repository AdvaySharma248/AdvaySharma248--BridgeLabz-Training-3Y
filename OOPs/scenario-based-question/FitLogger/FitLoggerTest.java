import java.util.*;

public class FitLoggerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitLogger logger = new FitLogger();
        boolean running = true;

        while (running) {
            System.out.println("\n--- FitLogger Menu ---");
            System.out.println("1. Add Meal");
            System.out.println("2. Show Total Calories");
            System.out.println("3. Show Meal Report");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter meal name: ");
                        String meal = sc.nextLine();
                        System.out.print("Enter calories: ");
                        String calStr = sc.nextLine();
                        try {
                            int cal = Integer.parseInt(calStr.trim());
                            logger.addMeal(meal, cal);
                            System.out.println("Meal added: " + meal + " - " + cal + " cal");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Calories must be a number.");
                        }
                        break;
                    case 2:
                        System.out.println("Total Calories: " + logger.getTotalCalories());
                        break;
                    case 3:
                        System.out.println(logger.getMealReport());
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (OverLimitException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}