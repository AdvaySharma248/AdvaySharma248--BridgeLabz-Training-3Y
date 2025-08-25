import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] studentAges = new int[10];

        System.out.println("Enter the ages for 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
        }

        scanner.close();
    }
}
