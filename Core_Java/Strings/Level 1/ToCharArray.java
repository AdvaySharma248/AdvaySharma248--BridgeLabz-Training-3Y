import java.util.Scanner;
import java.util.Arrays;

public class ToCharArray {

    public static char[] getCharsFromString(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.next();

        char[] customResult = getCharsFromString(text);
        char[] builtinResult = text.toCharArray();

        System.out.println("\nResult from custom method: " + Arrays.toString(customResult));
        System.out.println("Result from built-in toCharArray(): " + Arrays.toString(builtinResult));

        if (compareCharArrays(customResult, builtinResult)) {
            System.out.println("Both methods produced the same character array.");
        } else {
            System.out.println("The methods produced different arrays.");
        }
        scanner.close();
    }
}
