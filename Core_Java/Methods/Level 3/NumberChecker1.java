import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class NumberChecker1 {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int[] digits = getDigits(num);

        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is it a Duck number? " + isDuckNumber(digits));
        System.out.println("Is it an Armstrong number? " + isArmstrongNumber(num));
        
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0] + ", Second largest: " + largest[1]);
        
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0] + ", Second smallest: " + smallest[1]);
        
        scanner.close();
    }
}
