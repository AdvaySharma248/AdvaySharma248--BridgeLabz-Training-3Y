import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; ) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            int p = scanner.nextInt();
            System.out.print("Chemistry: ");
            int c = scanner.nextInt();
            System.out.print("Maths: ");
            int m = scanner.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                continue;
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentages[i] = (p + c + m) / 3.0;

            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
            i++;
        }

        System.out.println("\n--- Student Scorecard ---");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%c%n", (i+1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        scanner.close();
    }
}
