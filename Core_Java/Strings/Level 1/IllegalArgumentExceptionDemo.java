import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        System.out.println("Attempting to generate IllegalArgumentException...");
        text.substring(5, 2); 
    }

    public static void handleException(String text) {
        System.out.println("Attempting to handle IllegalArgumentException...");
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Specific Exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught Generic Runtime Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text (at least 6 characters): ");
        String text = scanner.nextLine();

        handleException(text);
        
        System.out.println("\nNow, let's see the unhandled exception:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught the generated exception in main: " + e);
        }
        scanner.close();
    }
}
