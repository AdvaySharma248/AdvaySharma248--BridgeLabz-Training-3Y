import java.util.*;

public class MainQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] correct = new String[n];
        System.out.println("Enter correct answers:");
        for (int i = 0; i < n; i++) {
            correct[i] = sc.nextLine();
        }

        QuizProcessor qp = new QuizProcessor(correct);
        List<Integer> scores = new ArrayList<>();

        System.out.print("Enter number of users: ");
        int users = sc.nextInt();
        sc.nextLine();

        for (int u = 1; u <= users; u++) {
            System.out.println("User " + u + " answers:");
            String[] userAns = new String[n];
            for (int i = 0; i < n; i++) {
                userAns[i] = sc.nextLine();
            }

            try {
                int score = qp.calculateScore(userAns);
                scores.add(score);
                System.out.println("User " + u + " Score: " + score + " Grade: " + qp.getGrade(score));
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("Invalid submission for user " + u + ": " + e.getMessage());
            }
        }

        System.out.println("All Scores: " + scores);
        sc.close();
    }
}
