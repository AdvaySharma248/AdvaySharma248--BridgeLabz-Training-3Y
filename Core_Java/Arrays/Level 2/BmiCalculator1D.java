import java.util.Scanner;

public class BmiCalculator1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] statuses = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heights[i] = scanner.nextDouble();

            double heightInM = heights[i] / 100.0;
            bmis[i] = weights[i] / (heightInM * heightInM);

            if (bmis[i] <= 18.4) statuses[i] = "Underweight";
            else if (bmis[i] <= 24.9) statuses[i] = "Normal";
            else if (bmis[i] <= 39.9) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.2f\t%s%n", (i+1), heights[i], weights[i], bmis[i], statuses[i]);
        }
        scanner.close();
    }
}
