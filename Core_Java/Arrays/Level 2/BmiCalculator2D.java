import java.util.Scanner;

public class BmiCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; ) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Height (cm): ");
            double height = scanner.nextDouble();

            if (weight < 0 || height < 0) {
                System.out.println("Please enter positive values.");
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;

            double heightInM = height / 100.0;
            double bmi = weight / (heightInM * heightInM);
            personData[i][2] = bmi;

            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
            i++;
        }

        System.out.println("\n--- BMI Report ---");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.2f\t%s%n", (i+1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        scanner.close();
    }
}
