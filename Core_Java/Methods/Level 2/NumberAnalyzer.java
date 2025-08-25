import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive");
                if (isEven(number)) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        System.out.println("\n--- First vs. Last Element Comparison ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compare(first, last);

        if (comparisonResult == 1) {
            System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        } else if (comparisonResult == -1) {
            System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is equal to the last element (" + last + ").");
        }
        scanner.close();
    }
}
