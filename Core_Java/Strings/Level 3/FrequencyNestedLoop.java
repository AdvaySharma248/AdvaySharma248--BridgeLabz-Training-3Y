import java.util.Scanner;

public class FrequencyNestedLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = findFrequency(text);

        System.out.println("Character Frequencies (using nested loops):");
        for (String[] entry : frequencies) {
            System.out.println("'" + entry[0] + "' : " + entry[1]);
        }
        scanner.close();
    }

    public static String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        int validCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
            validCount++;
        }

        String[][] result = new String[validCount][2];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && chars[i] != '0') {
                 result[index][0] = String.valueOf(chars[i]);
                 result[index][1] = String.valueOf(freq[i]);
                 index++;
            }
        }
        return result;
    }
}