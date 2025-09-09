import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }

    public double getCgpa() {
        return this.cgpa;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String researchArea;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String researchArea) {
        super(rollNumber, name, cgpa);
        this.researchArea = researchArea;
    }

    public void displayPostgraduateDetails() {
        System.out.println("--- Postgraduate Student Details ---");
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name (from protected): " + name); 
        System.out.println("CGPA (via public getter): " + getCgpa());
        System.out.println("Research Area: " + researchArea);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a Student:");
        System.out.print("Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("CGPA: ");
        double studentCgpa = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(roll, studentName, studentCgpa);
        System.out.println("\n--- Initial Student Details ---");
        student.displayStudentDetails();

        System.out.print("\nEnter new CGPA to modify: ");
        double newCgpa = scanner.nextDouble();
        scanner.nextLine();
        student.setCgpa(newCgpa);
        
        System.out.println("\n--- Updated Student Details ---");
        student.displayStudentDetails();
        
        System.out.println("\n--- Accessing public member directly ---");
        System.out.println("Accessible Roll Number: " + student.rollNumber);


        System.out.println("\nEnter details for a Postgraduate Student:");
        System.out.print("Roll Number: ");
        int pgRoll = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String pgName = scanner.nextLine();
        System.out.print("CGPA: ");
        double pgCgpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Research Area: ");
        String research = scanner.nextLine();

        PostgraduateStudent pgStudent = new PostgraduateStudent(pgRoll, pgName, pgCgpa, research);
        System.out.println();
        pgStudent.displayPostgraduateDetails();
        
        scanner.close();
    }
}
