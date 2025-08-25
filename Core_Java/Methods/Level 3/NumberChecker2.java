import java.util.Scanner;
import java.lang.Math;

public class NumberChecker2 {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        return (int) Math.floor(Math.log10(Math.abs(number))) + 1;
    }

    public static int[] getDigits(int number) {
        int num = Math.abs(number);
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        if (number == 0) return false;
        return number % sumOfDigits(getDigits(number)) == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[] counts = new int[10];
        for (int digit : digits) {
            counts[digit]++;
        }
        int nonZeroCount = 0;
        for(int count : counts) {
            if(count > 0) nonZeroCount++;
        }
        
        int[][] frequency = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                frequency[index][0] = i;
                frequency[index][1] = counts[i];
                index++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int[] digits = getDigits(num);

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is it a Harshad number? " + isHarshadNumber(num));

        int[][] freq = findDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : freq) {
            System.out.println("Digit " + row[0] + ": " + row[1] + " times");
        }
        scanner.close();
    }
}
