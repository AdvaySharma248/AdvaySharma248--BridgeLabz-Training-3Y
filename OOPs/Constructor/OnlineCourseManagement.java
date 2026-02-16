import java.util.Scanner;

class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "Global Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("--- Course Details ---");
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Duration: " + this.duration + " months");
        System.out.println("Fee: $" + this.fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Creating Course 1 ---");
        System.out.print("Enter course name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter duration (months): ");
        int duration1 = scanner.nextInt();
        System.out.print("Enter fee: ");
        double fee1 = scanner.nextDouble();
        scanner.nextLine();
        Course c1 = new Course(name1, duration1, fee1);
        
        System.out.println("\n--- Creating Course 2 ---");
        System.out.print("Enter course name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter duration (months): ");
        int duration2 = scanner.nextInt();
        System.out.print("Enter fee: ");
        double fee2 = scanner.nextDouble();
        scanner.nextLine();
        Course c2 = new Course(name2, duration2, fee2);

        System.out.println("\n--- Displaying Initial Details ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.print("\nEnter new institute name to update for all courses: ");
        String newInstitute = scanner.nextLine();
        Course.updateInstituteName(newInstitute);

        System.out.println("\n--- Displaying Details After Update ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        scanner.close();
    }
}
