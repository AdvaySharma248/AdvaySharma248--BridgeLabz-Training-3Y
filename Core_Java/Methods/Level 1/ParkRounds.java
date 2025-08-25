import java.util.Scanner;

public class ParkRounds {

    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        if (perimeter == 0) {
            return 0;
        }
        double totalDistance = 5000;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (meters): ");
        double s1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (meters): ");
        double s2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (meters): ");
        double s3 = scanner.nextDouble();

        double rounds = computeRounds(s1, s2, s3);

        System.out.printf("The athlete must complete %.2f rounds to run 5 km.%n", rounds);

        scanner.close();
    }
}
