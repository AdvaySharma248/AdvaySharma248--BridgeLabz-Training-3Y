public class UnitConverter3 {

    public static double convertFarhenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Temperature, Weight, and Volume Conversions ---");
        System.out.println("68°F is " + String.format("%.2f", convertFarhenheitToCelsius(68)) + "°C.");
        System.out.println("20°C is " + String.format("%.2f", convertCelsiusToFarhenheit(20)) + "°F.");
        System.out.println("10 pounds is " + convertPoundsToKilograms(10) + " kilograms.");
        System.out.println("10 kilograms is " + convertKilogramsToPounds(10) + " pounds.");
        System.out.println("10 gallons is " + convertGallonsToLiters(10) + " liters.");
        System.out.println("10 liters is " + convertLitersToGallons(10) + " gallons.");
    }
}
