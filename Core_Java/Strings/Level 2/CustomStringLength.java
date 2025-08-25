import java.util.Scanner;

public class CustomStringLength {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception signals the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        int customLength = findLength(text);
        int builtinLength = text.length();

        System.out.println("Length from custom method: " + customLength);
        System.out.println("Length from built-in length() method: " + builtinLength);
        scanner.close();
    }
}
