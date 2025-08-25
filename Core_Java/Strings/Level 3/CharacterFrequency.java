import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = getCharFrequencies(text);

        System.out.println("Character Frequencies:");
        for (String[] entry : frequencies) {
            System.out.println("'" + entry[0] + "' : " + entry[1]);
        }
        scanner.close();
    }

    public static String[][] getCharFrequencies(String text) {
        int[] counts = new int[256];
        int nonZeroCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (counts[ch] == 0) {
                nonZeroCount++;
            }
            counts[ch]++;
        }

        String[][] result = new String[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (counts[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(counts[ch]);
                counts[ch] = 0; 
                index++;
            }
        }
        return result;
    }
}