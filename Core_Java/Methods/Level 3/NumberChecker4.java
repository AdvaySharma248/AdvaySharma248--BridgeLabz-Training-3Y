import java.util.Scanner;
import java.lang.Math;

public class NumberChecker4 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        long square = (long) number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Is it a Prime number? " + isPrime(num));
        System.out.println("Is it a Neon number? " + isNeonNumber(num));
        System.out.println("Is it a Spy number? " + isSpyNumber(num));
        System.out.println("Is it an Automorphic number? " + isAutomorphicNumber(num));
        System.out.println("Is it a Buzz number? " + isBuzzNumber(num));
        
        scanner.close();
    }
}
