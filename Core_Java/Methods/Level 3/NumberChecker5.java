import java.util.Scanner;

public class NumberChecker5 {

    private static int sumOfProperDivisors(int number) {
        if (number <= 1) return 0;
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i * i != number) {
                    sum += number / i;
                }
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Is it a Perfect number? " + isPerfectNumber(num));
        System.out.println("Is it an Abundant number? " + isAbundantNumber(num));
        System.out.println("Is it a Deficient number? " + isDeficientNumber(num));
        System.out.println("Is it a Strong number? " + isStrongNumber(num));
        
        scanner.close();
    }
}
