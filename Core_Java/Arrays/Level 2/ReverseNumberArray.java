import java.util.Scanner;
import java.util.Arrays;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int tempNumber = Math.abs(number);

        int count = String.valueOf(tempNumber).length();
        int[] digits = new int[count];
        int[] reversedDigits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        scanner.close();
    }
}
