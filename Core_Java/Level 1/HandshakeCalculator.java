import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        long maxHandshakes = 0;
        if (numberOfStudents > 1) {
             maxHandshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
        }

        System.out.printf("For %d students, the maximum number of possible handshakes is %d.\n",
                numberOfStudents, maxHandshakes);

        input.close();
    }
}
