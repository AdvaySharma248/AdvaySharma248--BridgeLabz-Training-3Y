
public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        System.out.println("Attempting to generate ArrayIndexOutOfBoundsException...");
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        System.out.println("Attempting to handle ArrayIndexOutOfBoundsException...");
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Specific Exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught Generic Runtime Exception: " + e);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        
        handleException(names);
        
        System.out.println("\nNow, let's see the unhandled exception:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught the generated exception in main: " + e);
        }
    }
}
