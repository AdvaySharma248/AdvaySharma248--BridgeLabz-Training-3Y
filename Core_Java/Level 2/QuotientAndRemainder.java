import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer (dividend): ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer (divisor): ");
        int number2 = input.nextInt();

        int quotient = 0;
        int remainder = 0;

        if (number2 != 0) {
            quotient = number1 / number2;
            remainder = number1 % number2;
        }

        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n",
                quotient, remainder, number1, number2);

        input.close();
    }
}
