import java.util.Scanner;
public class FrequencyWithUniques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = getFrequency(text);

        System.out.println("Character Frequencies (based on unique chars):");
        for (String[] entry : frequencies) {
            System.out.println("'" + entry[0] + "' : " + entry[1]);
        }
        scanner.close();
    }

    public static char[] findUniqueChars(String text) {
        String uniqueStr = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (uniqueStr.indexOf(currentChar) == -1) {
                uniqueStr += currentChar;
            }
        }
        return uniqueStr.toCharArray();
    }

    public static String[][] getFrequency(String text) {
        char[] uniqueChars = findUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];
        int[] counts = new int[256];

        for (int i = 0; i < text.length(); i++) {
            counts[text.charAt(i)]++;
        }

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(counts[ch]);
        }
        return result;
    }
}