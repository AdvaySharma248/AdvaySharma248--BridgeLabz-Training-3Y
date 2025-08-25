import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] unique = findUniqueChars(text);

        System.out.println("Unique characters are: " + Arrays.toString(unique));
        scanner.close();
    }

    public static int getTextLength(String text) {
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
    }

    public static char[] findUniqueChars(String text) {
        int length = getTextLength(text);
        char[] foundChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (foundChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                foundChars[uniqueCount++] = currentChar;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = foundChars[i];
        }

        return result;
    }
}