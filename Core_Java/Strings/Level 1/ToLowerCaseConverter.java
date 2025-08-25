import java.util.Scanner;

public class ToLowerCaseConverter {

    public static String customToLowerCase(String text) {
        String lower = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lower += (char)(ch + 32);
            } else {
                lower += ch;
            }
        }
        return lower;
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
        System.out.print("Enter text to convert to lowercase: ");
        String text = scanner.nextLine();

        String customLower = customToLowerCase(text);
        String builtinLower = text.toLowerCase();

        System.out.println("\nResult from custom method: " + customLower);
        System.out.println("Result from built-in toLowerCase(): " + builtinLower);

        if (compareStrings(customLower, builtinLower)) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The methods produced different results.");
        }
        scanner.close();
    }
}
