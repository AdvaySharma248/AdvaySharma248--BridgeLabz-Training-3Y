import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x2 - x1) == 0 || (x3 - x2) == 0) {
            return (x2 - x1) == 0 && (x3 - x2) == 0;
        }
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        
        return Math.abs(slopeAB - slopeBC) < 0.00001;
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates for point A (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates for point B (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter the coordinates for point C (x3, y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("\n--- Checking with sample points A(2, 4), B(4, 6), C(6, 8) ---");
        System.out.println("Collinear by Slope Formula: " + areCollinearBySlope(2, 4, 4, 6, 6, 8));
        System.out.println("Collinear by Area Formula: " + areCollinearByArea(2, 4, 4, 6, 6, 8));
        
        System.out.println("\n--- Checking with your input points ---");
        System.out.println("Collinear by Slope Formula: " + areCollinearBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear by Area Formula: " + areCollinearByArea(x1, y1, x2, y2, x3, y3));

        scanner.close();
    }
}
