public class Employee {
    String name;
    String id;
    String department;
    double basicSalary;

    public Employee(String name, String id, String department, double basicSalary) throws InvalidSalaryException {
        if (basicSalary < 0) throw new InvalidSalaryException("Salary cannot be negative");
        this.name = name;
        this.id = id;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateGross() {
        double hra = 0.2 * basicSalary;
        double da = 0.1 * basicSalary;
        return basicSalary + hra + da;
    }

    public double deductTaxes() {
        double gross = calculateGross();
        double tax = 0;
        if (gross <= 50000) tax = 0.05 * gross;
        else if (gross <= 100000) tax = 0.1 * gross;
        else tax = 0.15 * gross;
        return gross - tax;
    }
}
