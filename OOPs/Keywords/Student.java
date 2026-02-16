import java.util.Scanner;

public class Student {
    private static String universityName;
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter University Name: ");
        String uniName = scanner.nextLine();
        Student.setUniversityName(uniName);

        System.out.println("\n--- Enter Details for Student 1 ---");
        System.out.print("Enter Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll1 = scanner.nextInt();
        System.out.print("Enter Grade (A, B, C...): ");
        char grade1 = scanner.next().charAt(0);
        scanner.nextLine();
        Student student1 = new Student(name1, roll1, grade1);
        
        System.out.println("\n--- Enter Details for Student 2 ---");
        System.out.print("Enter Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll2 = scanner.nextInt();
        System.out.print("Enter Grade (A, B, C...): ");
        char grade2 = scanner.next().charAt(0);
        scanner.nextLine();
        Student student2 = new Student(name2, roll2, grade2);

        System.out.println();
        Student.displayTotalStudents();

        System.out.println("\n--- Student 1 Details ---");
        student1.displayStudentDetails();
        System.out.println();
        System.out.println("--- Student 2 Details ---");
        student2.displayStudentDetails();

        System.out.print("\nEnter the new grade for Student 2: ");
        char newGrade = scanner.next().charAt(0);
        student2.updateGrade(newGrade);
        System.out.println();

        System.out.println("--- Updated Student 2 Details ---");
        student2.displayStudentDetails();
        
        scanner.close();
    }
}
