import java.util.*;

public class MainGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subCount = sc.nextInt();
        sc.nextLine();

        GradingSystem gs = new GradingSystem(subCount);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            int[] grades = new int[subCount];
            System.out.println("Enter grades for " + name + ":");
            for (int j = 0; j < subCount; j++) {
                grades[j] = sc.nextInt();
            }
            sc.nextLine();
            try {
                Student s = new Student(name, id, grades);
                gs.addStudent(s);
            } catch (InvalidGradeException e) {
                System.out.println("Invalid grades for " + name + ": " + e.getMessage());
            }
        }

        gs.displayAll();
        gs.highestInSubjects();
        gs.classAverage();

        sc.close();
    }
}
