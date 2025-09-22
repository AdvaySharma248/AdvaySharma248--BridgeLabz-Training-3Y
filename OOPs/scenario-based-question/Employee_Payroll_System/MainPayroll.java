import java.util.*;

public class MainPayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem ps = new PayrollSystem();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i+1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            System.out.print("Enter basic salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            try {
                Employee e = new Employee(name, id, dept, salary);
                ps.addEmployee(e);
            } catch (InvalidSalaryException e) {
                System.out.println("Invalid salary for " + name + ": " + e.getMessage());
            }
        }

        ps.generateReport();
        sc.close();
    }
}
