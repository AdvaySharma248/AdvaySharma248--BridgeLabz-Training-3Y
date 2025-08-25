import java.util.Scanner;

public class BMICalculator {

    public static void calculateAllBMIs(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weightKg = data[i][0];
            double heightCm = data[i][1];
            if (heightCm > 0) {
                double heightM = heightCm / 100.0;
                data[i][2] = weightKg / (heightM * heightM);
            } else {
                data[i][2] = 0;
            }
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else if (bmi >= 40.0) {
                statuses[i] = "Obese";
            } else {
                statuses[i] = "N/A";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        System.out.println("Enter data for 10 team members:");
        for (int i = 0; i < teamData.length; i++) {
            System.out.println("--- Member " + (i + 1) + " ---");
            System.out.print("Enter weight in kg: ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height in cm: ");
            teamData[i][1] = scanner.nextDouble();
        }

        calculateAllBMIs(teamData);
        String[] statuses = getBMIStatus(teamData);

        System.out.println("\n--- Team BMI Report ---");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-12s%n", "Member", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < teamData.length; i++) {
            System.out.printf("%-10d | %-12.2f | %-12.2f | %-8.2f | %-12s%n", 
                (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }
        System.out.println("-----------------------------------------------------------------");

        scanner.close();
    }
}
