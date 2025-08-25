import java.util.Scanner;

public class SubstringCreator {

    public static String createSubstring(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            return "Invalid indices";
        }
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
        System.out.print("Enter the text: ");
        String text = scanner.next();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        String customSub = createSubstring(text, start, end);
        String builtinSub = text.substring(start, end);

        System.out.println("\nSubstring from custom method: " + customSub);
        System.out.println("Substring from built-in method: " + builtinSub);
        
        System.out.println("Are the two substrings equal? " + compareStrings(customSub, builtinSub));
        scanner.close();
    }
}
