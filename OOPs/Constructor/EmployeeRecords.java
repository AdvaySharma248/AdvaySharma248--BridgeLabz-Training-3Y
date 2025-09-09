import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("--- Manager Details ---");
        System.out.println("Employee ID (from public): " + employeeID);
        System.out.println("Department (from protected): " + department);
        System.out.println("Salary (via public getter): " + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for an Employee:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Salary: ");
        double sal = scanner.nextDouble();
        
        Employee employee = new Employee(empId, dept, sal);
        System.out.println("\n--- Initial Employee Details ---");
        employee.displayEmployeeDetails();

        System.out.print("\nEnter a new salary to modify: ");
        double newSalary = scanner.nextDouble();
        employee.setSalary(newSalary);
        System.out.println("\n--- Updated Employee Details ---");
        System.out.println("New Salary: " + employee.getSalary());

        System.out.println("\nEnter details for a Manager:");
        System.out.print("Employee ID: ");
        int mgrId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String mgrDept = scanner.nextLine();
        System.out.print("Salary: ");
        double mgrSal = scanner.nextDouble();
        System.out.print("Team Size: ");
        int team = scanner.nextInt();

        Manager manager = new Manager(mgrId, mgrDept, mgrSal, team);
        System.out.println();
        manager.displayManagerDetails();
        
        scanner.close();
    }
}
