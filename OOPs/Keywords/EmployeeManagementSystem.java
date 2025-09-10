import java.util.Scanner;

class Employee {
    private static String companyName;
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Company Name: ");
        String compName = scanner.nextLine();
        Employee.setCompanyName(compName);

        System.out.println("\n--- Enter Details for Employee 1 ---");
        System.out.print("Enter Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Designation: ");
        String des1 = scanner.nextLine();
        Employee emp1 = new Employee(name1, id1, des1);

        System.out.println("\n--- Enter Details for Employee 2 ---");
        System.out.print("Enter Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Designation: ");
        String des2 = scanner.nextLine();
        Employee emp2 = new Employee(name2, id2, des2);

        System.out.println();
        Employee.displayTotalEmployees();
        System.out.println();

        System.out.println("--- Employee 1 Details ---");
        emp1.displayEmployeeDetails();
        System.out.println();

        System.out.println("--- Employee 2 Details ---");
        emp2.displayEmployeeDetails();
        
        scanner.close();
    }
}
