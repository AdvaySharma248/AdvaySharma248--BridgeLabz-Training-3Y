public class Student {
    String name;
    String id;
    int[] grades;

    public Student(String name, String id, int[] grades) throws InvalidGradeException {
        for (int g : grades) {
            if (g < 0 || g > 100) throw new InvalidGradeException("Grade must be 0-100");
        }
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public int total() {
        int sum = 0;
        for (int g : grades) sum += g;
        return sum;
    }

    public double average() {
        return total() * 1.0 / grades.length;
    }
}
