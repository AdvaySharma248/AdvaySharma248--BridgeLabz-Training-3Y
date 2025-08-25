import java.util.Scanner;
import java.lang.Math;

public class StudentGradesRandom {

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Math
        }
        return scores;
    }

    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            metrics[i][0] = total;
            metrics[i][1] = Math.round((total / 3.0) * 100.0) / 100.0;
            metrics[i][2] = Math.round(((double) total / 300.0) * 10000.0) / 100.0;
        }
        return metrics;
    }
    
    public static char[] getGrades(double[][] metrics) {
        char[] grades = new char[metrics.length];
        for (int i = 0; i < metrics.length; i++) {
            double percentage = metrics[i][2];
            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] metrics, char[] grades) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Student\t\tPhysics\t\tChemistry\tMaths\t\tTotal\t\tAverage\t\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.0f\t\t%.2f\t\t%.2f%%\t\t%c%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], metrics[i][0], metrics[i][1], metrics[i][2], grades[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] metrics = calculateMetrics(scores);
        char[] grades = getGrades(metrics);
        displayScorecard(scores, metrics, grades);

        scanner.close();
    }
}
