import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
        scanner.close();
    }

    public static boolean areAnagrams(String text1, String text2) {
        String cleanText1 = text1.replaceAll("\\s", "").toLowerCase();
        String cleanText2 = text2.replaceAll("\\s", "").toLowerCase();

        if (cleanText1.length() != cleanText2.length()) {
            return false;
        }

        int[] charCounts = new int[256];

        for (int i = 0; i < cleanText1.length(); i++) {
            charCounts[cleanText1.charAt(i)]++;
            charCounts[cleanText2.charAt(i)]--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}