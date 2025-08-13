import java.util.Scanner;

public class Basic_Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = 0.0;
        
        if (number2 != 0) {
            quotient = number1 / number2;
        } else {
            System.out.println("\nCannot divide by zero. The result of division will be set to 0.");
        }

        System.out.printf("\nThe addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                number1, number2, sum, difference, product, quotient);
        
        input.close();
    }
}
