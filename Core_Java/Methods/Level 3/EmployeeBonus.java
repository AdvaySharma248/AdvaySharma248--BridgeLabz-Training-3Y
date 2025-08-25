import java.lang.Math;

public class EmployeeBonus {

    public static double[][] getSalaryAndService() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (Math.random() * 90000);
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] oldData) {
        double[][] newData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (oldData[i][1] > 5) {
                bonus = oldData[i][0] * 0.05;
            } else {
                bonus = oldData[i][0] * 0.02;
            }
            newData[i][0] = oldData[i][0] + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }

    public static void displaySalaryReport(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-12s | %-15s | %-15s | %-15s | %-15s%n", "Employee", "Years of Service", "Old Salary", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-12d | %-18.0f | %-15.2f | %-15.2f | %-15.2f%n",
                    (i + 1), oldData[i][1], oldData[i][0], newData[i][1], newData[i][0]);
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-33s | %-15.2f | %-15.2f | %-15.2f%n", "Total", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        double[][] employeeData = getSalaryAndService();
        double[][] newEmployeeData = calculateNewSalaryAndBonus(employeeData);
        displaySalaryReport(employeeData, newEmployeeData);
    }
}
