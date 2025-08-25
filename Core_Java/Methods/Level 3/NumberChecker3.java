import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] originalDigits = getDigits(number);
        int[] reversedDigits = reverseDigits(originalDigits);
        return areArraysEqual(originalDigits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int[] digits = getDigits(num);
        
        System.out.println("Original digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reverseDigits(digits)));
        System.out.println("Is it a Palindrome? " + isPalindrome(num));
        System.out.println("Is it a Duck number? " + isDuckNumber(digits));

        scanner.close();
    }
}
