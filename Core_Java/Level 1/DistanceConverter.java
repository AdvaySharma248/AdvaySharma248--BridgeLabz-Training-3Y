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

        System.out.printf("\nA distance of %.2f feet is equivalent to:\n", distanceInFeet);
        System.out.printf("%.2f yards\n", distanceInYards);
        System.out.printf("%.4f miles\n", distanceInMiles);

        input.close();
    }
}
