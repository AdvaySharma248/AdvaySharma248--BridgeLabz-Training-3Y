public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("--- Smaller Unit Conversions ---");
        System.out.println("10 yards is " + convertYardsToFeet(10) + " feet.");
        System.out.println("10 feet is " + convertFeetToYards(10) + " yards.");
        System.out.println("10 meters is " + convertMetersToInches(10) + " inches.");
        System.out.println("10 inches is " + convertInchesToMeters(10) + " meters.");
        System.out.println("10 inches is " + convertInchesToCentimeters(10) + " centimeters.");
    }
}
