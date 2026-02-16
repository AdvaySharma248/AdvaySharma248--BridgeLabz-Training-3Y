import java.util.Scanner;

public class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("\n--- Employee Details ---");
		System.out.println("Employee Name: " + name);
		System.out.println("Employee id: " + id);
		System.out.println("Employee Salary: " + salary);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		
		System.out.print("Enter Employee Salary: ");
		double salary = scanner.nextDouble();
		
		Employee emp = new Employee(name, id, salary);
		emp.displayEmployee();
		
		scanner.close();
	}
}