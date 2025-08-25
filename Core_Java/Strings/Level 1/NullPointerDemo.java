public class NullPointerDemo {

    public static void generateException() {
        System.out.println("Attempting to generate NullPointerException...");
        String text = null;
        System.out.println(text.length()); 
    }

    public static void handleException() {
        System.out.println("Attempting to handle NullPointerException...");
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("The string is null and cannot be processed.");
        }
    }

    public static void main(String[] args) {
        handleException();
        
        System.out.println("\nNow, let's see the unhandled exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
             System.out.println("Caught the generated exception in main: " + e);
        }
    }
}
