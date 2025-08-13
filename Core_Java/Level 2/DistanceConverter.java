import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int FEET_IN_A_YARD = 3;
        final int YARDS_IN_A_MILE = 1760;

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / FEET_IN_A_YARD;
        double distanceInMiles = distanceInYards / YARDS_IN_A_MILE;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n", distanceInYards, distanceInMiles);

        input.close();
    }
}
