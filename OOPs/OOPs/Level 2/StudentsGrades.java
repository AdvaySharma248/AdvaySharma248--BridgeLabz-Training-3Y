import java.util.Scanner;

public class StudentsGrades {
	String name;
	String rollNumber;
	double[] marks;

	StudentsGrades(String name, String rollNumber, double[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public String calculateGrade(double[] marks) {
		double averageMark = calculateAverageMark(marks);

		if (averageMark >= 80) {
			return "Grade A";
		} else if (averageMark >= 60) {
			return "Grade B";
		} else if (averageMark >= 50) {
			return "Grade C";
		} else if (averageMark >= 40) {
			return "Grade D";
		} else {
			return "Grade F";
		}
	}

	public void displayStudent() {
		System.out.println("\n--- Student Report ---");
		System.out.println("Student Name: " + name);
		System.out.println("Student RollNumber: " + rollNumber);
		System.out.println("Student Marks:");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1) + ": " + marks[i]);
		}
		System.out.println("Final Grade: " + calculateGrade(marks));
	}

	public double calculateAverageMark(double[] marks) {
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return sum / marks.length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Roll Number: ");
		String rollNumber = scanner.nextLine();

		double[] studentMarks = new double[3];
		System.out.println("Enter marks for 3 subjects:");
		for (int i = 0; i < studentMarks.length; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			studentMarks[i] = scanner.nextDouble();
		}

		StudentsGrades student = new StudentsGrades(name, rollNumber, studentMarks);
		student.displayStudent();
		
		scanner.close();
	}
}