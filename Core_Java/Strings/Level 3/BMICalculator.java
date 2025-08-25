import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        String[][] results = processBMI(personData);
        displayResults(results);

        scanner.close();
    }

    public static String[][] processBMI(double[][] personData) {
        String[][] results = new String[10][4];
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            String[] bmiInfo = calculateBMIAndStatus(weight, height);

            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height);
            results[i][2] = bmiInfo[0];
            results[i][3] = bmiInfo[1];
        }
        return results;
    }

    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        DecimalFormat df = new DecimalFormat("#.##");
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{df.format(bmi), status};
    }

    public static void displayResults(String[][] results) {
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-10s%n", "Person", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s | %-12s | %-12s | %-8s | %-10s%n",
                    "Person " + (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
        System.out.println("-------------------------------------------------------------");
    }
}