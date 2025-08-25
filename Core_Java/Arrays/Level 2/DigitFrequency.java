import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int tempNumber = Math.abs(number);

        int count = String.valueOf(tempNumber).length();
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }
        scanner.close();
    }
}
