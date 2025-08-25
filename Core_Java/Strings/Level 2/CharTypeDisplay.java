import java.util.Scanner;

public class CharTypeDisplay {

    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] getCharTypes(String text) {
        String[][] types = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            types[i][0] = String.valueOf(text.charAt(i));
            types[i][1] = getCharType(text.charAt(i));
        }
        return types;
    }

    public static void displayTypes(String[][] data) {
        System.out.println("Character\tType");
        for (String[] row : data) {
            System.out.printf("'%s'\t\t%s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        String[][] charTypes = getCharTypes(text);
        displayTypes(charTypes);
        scanner.close();
    }
}
