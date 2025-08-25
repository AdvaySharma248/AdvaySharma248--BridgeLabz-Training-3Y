import java.util.Scanner;

public class WordsAndLengths {

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
            if (text.charAt(i) == ' ' && i > 0 && text.charAt(i-1) != ' ') wordCount++;
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

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordsWithLengths = getWordsAndLengths(words);

        System.out.println("\n--- Words and Lengths ---");
        System.out.println("Word\t\tLength");
        for (String[] row : wordsWithLengths) {
            System.out.printf("%-15s %d%n", row[0], Integer.parseInt(row[1]));
        }
        scanner.close();
    }
}
