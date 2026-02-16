public class Problem1 {
    public static void main(String[] args) {
        Employee[] emps = new Employee[] {
            new FullTimeEmployee(1, "Alice", 50000, 5000),
            new PartTimeEmployee(2, "Bob", 300, 120) // hourly rate, hours worked
        };
        for (Employee e : emps) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("----");
        }
    }
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    protected double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double s) { this.baseSalary = s; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", BaseSalary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlyAllowance;
    public FullTimeEmployee(int id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.monthlyAllowance = allowance;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyAllowance;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
