import java.util.Scanner;

public class MaxHandshakes {

    public static int calculateHandshakes(int numberOfStudents) {
        if (numberOfStudents < 2) {
            return 0;
        }
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();

        int handshakes = calculateHandshakes(students);

        System.out.println("The maximum number of possible handshakes is " + handshakes);

        scanner.close();
    }
}
