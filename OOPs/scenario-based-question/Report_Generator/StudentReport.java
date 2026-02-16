public class StudentReport {
    String name;
    String[] subjects;
    int[] marks;

    public StudentReport(String name, String[] subjects, int[] marks) {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public double calcAverage() throws InvalidMarkException {
        double sum = 0;
        for (int m : marks) {
            if (m < 0 || m > 100) throw new InvalidMarkException("Mark out of range");
            sum += m;
        }
        return sum / marks.length;
    }

    public String getGrade(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }

    public void displayReport() throws InvalidMarkException {
        System.out.println("Report Card for " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        double avg = calcAverage();
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + getGrade(avg));
        System.out.println("-----------------------");
    }
}
