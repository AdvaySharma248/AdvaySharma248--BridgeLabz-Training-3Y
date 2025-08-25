import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    public static void displayStats(int userWins, int computerWins, int games) {
        if (games == 0) return;
        double userWinPct = (double) userWins / games * 100;
        double computerWinPct = (double) computerWins / games * 100;
        System.out.println("\n--- Final Stats ---");
        System.out.println("\t\tUser\tComputer");
        System.out.printf("Wins\t\t%d\t%d%n", userWins, computerWins);
        System.out.printf("Win %%\t\t%.2f%%\t%.2f%%%n", userWinPct, computerWinPct);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games would you like to play? ");
        int numGames = scanner.nextInt();
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("\nEnter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("user")) {
                System.out.println("You win this round!");
                userWins++;
            } else if (winner.equals("computer")) {
                System.out.println("Computer wins this round!");
                computerWins++;
            } else {
                System.out.println("It's a draw!");
            }
        }
        displayStats(userWins, computerWins, numGames);
        scanner.close();
    }
}
