import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {
        System.out.println("Attempting to generate NumberFormatException...");
        Integer.parseInt(text);
    }

    public static void handleException(String text) {
        System.out.println("Attempting to handle NumberFormatException...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Successfully parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught Specific Exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught Generic Runtime Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String text = scanner.nextLine();

        handleException(text);
        
        System.out.println("\nNow, let's see the unhandled exception (if input is not a number):");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught the generated exception in main: " + e);
        }
        scanner.close();
    }
}
