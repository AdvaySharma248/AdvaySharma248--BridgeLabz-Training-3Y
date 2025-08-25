
public class StudentVoteCheckerRandom {

    public static int[] generateRandomAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Ages 10-99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                results[i][1] = "true";
            } else {
                results[i][1] = "false";
            }
        }
        return results;
    }

    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote?");
        for (String[] row : data) {
            System.out.printf("%s\t%s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);
    }
}
