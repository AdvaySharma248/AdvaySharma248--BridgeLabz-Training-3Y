public class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("--- Distance Conversions ---");
        System.out.println("10 kilometers is " + convertKmToMiles(10) + " miles.");
        System.out.println("10 miles is " + convertMilesToKm(10) + " kilometers.");
        System.out.println("10 meters is " + convertMetersToFeet(10) + " feet.");
        System.out.println("10 feet is " + convertFeetToMeters(10) + " meters.");
    }
}
