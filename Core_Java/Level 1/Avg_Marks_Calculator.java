class AverageMarksCalculator {
    public static void main(String[] args) {
        String studentName = "Sam";
        double mathsMark = 94;
        double physicsMark = 95;
        double chemistryMark = 96;
        double totalMarks = mathsMark + physicsMark + chemistryMark;
        double averagePercentMark = totalMarks / 3.0;

        System.out.println(studentName + "'s average mark in PCM is " + averagePercentMark);
    }
}
