import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
        System.out.println("Attempting to generate StringIndexOutOfBoundsException...");
        System.out.println(text.charAt(text.length())); 
    }

    public static void handleException(String text) {
        System.out.println("Attempting to handle StringIndexOutOfBoundsException...");
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("The index is out of the string's bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        handleException(text);
        
        System.out.println("\nNow, let's see the unhandled exception:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught the generated exception in main: " + e);
        }
        scanner.close();
    }
}
