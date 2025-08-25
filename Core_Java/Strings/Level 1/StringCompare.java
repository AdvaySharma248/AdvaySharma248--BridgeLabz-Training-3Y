import java.util.Scanner;

public class StringCompare {

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean customMethodResult = compareStrings(str1, str2);
        boolean builtinMethodResult = str1.equals(str2);

        System.out.println("\nResult from custom charAt() method: " + customMethodResult);
        System.out.println("Result from built-in equals() method: " + builtinMethodResult);

        if (customMethodResult == builtinMethodResult) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The methods produced different results.");
        }
        scanner.close();
    }
}
