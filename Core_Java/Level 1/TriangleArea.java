import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double INCH_TO_CM = 2.54;

        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = input.nextDouble();

        double areaSquareInches = 0.5 * baseInches * heightInches;

        double baseCm = baseInches * INCH_TO_CM;
        double heightCm = heightInches * INCH_TO_CM;
        double areaSquareCm = 0.5 * baseCm * heightCm;
        
        System.out.printf("\nFor a triangle with a base of %.2f inches and a height of %.2f inches:\n", baseInches, heightInches);
        System.out.printf("The area is %.2f square inches.\n", areaSquareInches);
        System.out.printf("The area is %.2f square centimeters.\n", areaSquareCm);

        input.close();
    }
}
