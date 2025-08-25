import java.util.Scanner;
import java.lang.Math;

public class WindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (must be <= 50): ");
        double temp = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour (must be >= 3): ");
        double speed = scanner.nextDouble();

        if (temp > 50 || speed < 3) {
            System.out.println("The formula is not valid for the given inputs. Please check the conditions.");
        } else {
            double windChill = calculateWindChill(temp, speed);
            System.out.printf("The wind chill temperature is %.2f°F%n", windChill);
        }

        scanner.close();
    }
}
