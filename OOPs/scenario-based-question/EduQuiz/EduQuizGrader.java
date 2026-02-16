public class EduQuizGrader {

    public static int calculateScore(String[] correctAnswers, String[] studentAnswers) {
        int score = 0;
        try {
            if (correctAnswers.length != studentAnswers.length) {
                throw new ArrayIndexOutOfBoundsException("Answer array size mismatch");
            }
            for (int i = 0; i < correctAnswers.length; i++) {
                if (studentAnswers[i] == null) throw new NullPointerException("Answer missing at question " + (i+1));
                if (correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {
                    System.out.println("Question " + (i+1) + ": Correct");
                    score++;
                } else {
                    System.out.println("Question " + (i+1) + ": Incorrect");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return score;
    }

    public static void main(String[] args) {
        String[] correctAnswers = {"A","C","B","D","A","B","C","D","A","B"};
        String[] studentAnswers = new String[10];

        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter answer for question " + (i+1) + ": ");
            studentAnswers[i] = sc.nextLine();
        }

        int score = calculateScore(correctAnswers, studentAnswers);
        double percentage = (score * 100.0) / correctAnswers.length;

        System.out.println("Total Score: " + score + "/" + correctAnswers.length);
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
