import java.util.Scanner;

public class CustomTrim {

    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length();
        while (start < end && text.charAt(start) == ' ') {
            start++;
        }
        while (end > start && text.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = scanner.nextLine();

        int[] indices = findTrimIndices(text);
        String customTrim = createSubstring(text, indices[0], indices[1]);
        String builtinTrim = text.trim();

        System.out.println("Custom trim result: '" + customTrim + "'");
        System.out.println("Built-in trim result: '" + builtinTrim + "'");
        System.out.println("Do the results match? " + compareStrings(customTrim, builtinTrim));
        scanner.close();
    }
}
