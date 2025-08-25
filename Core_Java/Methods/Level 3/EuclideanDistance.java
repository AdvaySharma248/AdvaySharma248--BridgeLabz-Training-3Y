import java.util.Scanner;
import java.lang.Math;

public class EuclideanDistance {

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) {
            return new double[]{Double.POSITIVE_INFINITY, x1};
        }
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for point 1 (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for point 2 (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        double[] equation = findLineEquation(x1, y1, x2, y2);
        if (equation[0] == Double.POSITIVE_INFINITY) {
            System.out.println("Equation of the line: x = " + equation[1]);
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", equation[0], equation[1]);
        }

        scanner.close();
    }
}
