import java.util.Scanner;
import java.util.Arrays;

public class CustomSplit {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] splitText(String text) {
        int wordCount = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ' && i > 0 && text.charAt(i - 1) != ' ') {
                wordCount++;
            }
        }
        wordCount++; 

        String[] words = new String[wordCount];
        String currentWord = "";
        int wordIndex = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                currentWord += text.charAt(i);
            } else {
                if (findLength(currentWord) > 0) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }
        words[wordIndex] = currentWord;
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        String[] customSplit = splitText(text);
        String[] builtinSplit = text.split("\\s+");

        System.out.println("Words from custom split: " + Arrays.toString(customSplit));
        System.out.println("Words from built-in split: " + Arrays.toString(builtinSplit));
        System.out.println("Do the results match? " + compareStringArrays(customSplit, builtinSplit));
        scanner.close();
    }
}
