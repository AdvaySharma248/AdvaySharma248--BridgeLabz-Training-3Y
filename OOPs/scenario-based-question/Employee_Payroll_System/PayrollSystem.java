import java.util.*;

public class PayrollSystem {
    List<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added: " + e.name);
    }

    public void generateReport() {
        System.out.println("Annual Salary Report:");
        for (Employee e : employees) {
            double gross = e.calculateGross();
            double net = e.deductTaxes();
            System.out.println("Name: " + e.name + " | ID: " + e.id + " | Dept: " + e.department);
            System.out.println("Basic: " + e.basicSalary + " | Gross: " + gross + " | Net: " + net);
            System.out.println("--------------------");
        }
    }
}
