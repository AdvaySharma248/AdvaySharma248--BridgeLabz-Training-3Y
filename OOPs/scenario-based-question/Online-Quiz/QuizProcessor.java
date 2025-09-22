public class QuizProcessor {
    String[] correctAnswers;

    public QuizProcessor(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int calculateScore(String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer length doesn't match");
        }
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public String getGrade(int score) {
        double percent = (score * 100.0) / correctAnswers.length;
        if (percent >= 90) return "A";
        else if (percent >= 75) return "B";
        else if (percent >= 50) return "C";
        else return "D";
    }
}
