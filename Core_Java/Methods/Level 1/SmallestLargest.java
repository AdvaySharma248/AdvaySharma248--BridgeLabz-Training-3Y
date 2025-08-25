import java.util.Scanner;
import java.lang.Math;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        int[] minMax = findSmallestAndLargest(n1, n2, n3);

        System.out.println("The smallest number is: " + minMax[0]);
        System.out.println("The largest number is: " + minMax[1]);

        scanner.close();
    }
}
