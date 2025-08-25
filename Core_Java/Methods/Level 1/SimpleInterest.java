import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = scanner.nextDouble();

        double simpleInterest = calculateSI(p, r, t);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n", simpleInterest, p, r, t);

        scanner.close();
    }
}
