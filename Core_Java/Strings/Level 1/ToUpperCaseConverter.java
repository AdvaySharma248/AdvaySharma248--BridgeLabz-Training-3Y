import java.util.Scanner;

public class ToUpperCaseConverter {

    public static String customToUpperCase(String text) {
        String upper = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - 32);
            } else {
                upper += ch;
            }
        }
        return upper;
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
        System.out.print("Enter text to convert to uppercase: ");
        String text = scanner.nextLine();

        String customUpper = customToUpperCase(text);
        String builtinUpper = text.toUpperCase();

        System.out.println("\nResult from custom method: " + customUpper);
        System.out.println("Result from built-in toUpperCase(): " + builtinUpper);

        if (compareStrings(customUpper, builtinUpper)) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The methods produced different results.");
        }
        scanner.close();
    }
}
