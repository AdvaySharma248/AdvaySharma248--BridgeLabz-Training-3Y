import java.util.*;

public class GradingSystem {
    List<Student> students;
    int subjectsCount;

    public GradingSystem(int subjectsCount) {
        students = new ArrayList<>();
        this.subjectsCount = subjectsCount;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void highestInSubjects() {
        for (int i = 0; i < subjectsCount; i++) {
            int max = -1;
            for (Student s : students) {
                if (s.grades.length > i) {
                    if (s.grades[i] > max) max = s.grades[i];
                }
            }
            System.out.println("Highest grade in subject " + (i+1) + ": " + max);
        }
    }

    public void classAverage() {
        int sum = 0, count = 0;
        for (Student s : students) {
            for (int g : s.grades) {
                sum += g;
                count++;
            }
        }
        System.out.println("Overall class average: " + (sum * 1.0 / count));
    }

    public void displayAll() {
        for (Student s : students) {
            System.out.println("Student: " + s.name + " | ID: " + s.id);
            System.out.println("Grades: " + Arrays.toString(s.grades));
            System.out.println("Total: " + s.total() + " | Average: " + s.average());
            System.out.println("--------------------");
        }
    }
}
