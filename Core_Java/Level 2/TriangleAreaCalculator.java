import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double CM_TO_INCH = 1 / 2.54;

        System.out.print("Enter the base of the triangle (in cm): ");
        double baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double heightCm = input.nextDouble();

        double areaSqCm = 0.5 * baseCm * heightCm;
        double areaSqIn = areaSqCm * CM_TO_INCH * CM_TO_INCH;

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaSqIn, areaSqCm);

        input.close();
    }
}
