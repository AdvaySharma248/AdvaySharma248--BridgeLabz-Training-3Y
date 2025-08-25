import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] employeeData = new double[10][2];
        double[][] bonusData = new double[10][2];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; ) {
            System.out.print("Employee " + (i + 1) + " - Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Employee " + (i + 1) + " - Years of Service: ");
            double years = scanner.nextDouble();

            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                continue;
            }
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
            i++;
        }

        for (int i = 0; i < 10; i++) {
            double bonus;
            if (employeeData[i][1] > 5) {
                bonus = employeeData[i][0] * 0.05;
            } else {
                bonus = employeeData[i][0] * 0.02;
            }
            bonusData[i][1] = bonus;
            bonusData[i][0] = employeeData[i][0] + bonus;

            totalOldSalary += employeeData[i][0];
            totalBonus += bonus;
            totalNewSalary += bonusData[i][0];
        }

        System.out.println("\n--- Zara Bonus Report ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        scanner.close();
    }
}
