import java.util.Scanner;
import java.lang.Math;

public class StudentMarks {

    public static int[][] getStudentScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
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

    public static void displayScorecard(int[][] scores, double[][] metrics) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Student\t\tPhysics\t\tChemistry\tMaths\t\tTotal\t\tAverage\t\tPercentage");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.0f\t\t%.2f\t\t%.2f%%%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], metrics[i][0], metrics[i][1], metrics[i][2]);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = getStudentScores(numStudents);
        double[][] metrics = calculateMetrics(scores);
        displayScorecard(scores, metrics);

        scanner.close();
    }
}
