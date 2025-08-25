import java.util.Scanner;

public class ShortestLongestWord {

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
    
    public static String[] findShortestAndLongest(String[] words) {
        if (words.length == 0) return new String[]{"", ""};
        String shortest = words[0];
        String longest = words[0];
        for (String word : words) {
            if (findLength(word) < findLength(shortest)) {
                shortest = word;
            }
            if (findLength(word) > findLength(longest)) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        scanner.close();
    }
}
