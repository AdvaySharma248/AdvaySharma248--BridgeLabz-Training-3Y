import java.util.*;

public class MainReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<StudentReport> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subCount = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[subCount];
        System.out.println("Enter subject names:");
        for (int i = 0; i < subCount; i++) {
            subjects[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            String name = sc.nextLine();
            int[] marks = new int[subCount];
            System.out.println("Enter marks for " + name + ":");
            for (int j = 0; j < subCount; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students.add(new StudentReport(name, subjects, marks));
        }

        for (StudentReport s : students) {
            try {
                s.displayReport();
            } catch (InvalidMarkException e) {
                System.out.println("Error for " + s.name + ": " + e.getMessage());
            }
        }

        sc.close();
    }
}
