import java.util.Scanner;

public class NumberAnalyzer {
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
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        System.out.println("\n--- First vs. Last Element Comparison ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first > last) {
            System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        } else if (first < last) {
            System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is equal to the last element (" + last + ").");
        }
        scanner.close();
    }
}
