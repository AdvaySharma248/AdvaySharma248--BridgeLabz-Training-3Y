import java.util.Scanner;

public class CardDealer {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        String[] deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards to distribute per player: ");
        int numCards = scanner.nextInt();

        String[][] distributedHands = distributeCards(deck, numPlayers, numCards);
        
        if (distributedHands != null) {
            printPlayerHands(distributedHands);
        }
        
        scanner.close();
    }

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[i++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int numCardsPerPlayer) {
        if (numPlayers * numCardsPerPlayer > deck.length) {
            System.out.println("Error: Not enough cards in the deck to distribute.");
            return null;
        }

        String[][] playerHands = new String[numPlayers][numCardsPerPlayer];
        int cardIndex = 0;
        
        for (int card = 0; card < numCardsPerPlayer; card++) {
            for (int player = 0; player < numPlayers; player++) {
                playerHands[player][card] = deck[cardIndex++];
            }
        }
        return playerHands;
    }

    public static void printPlayerHands(String[][] playerHands) {
        System.out.println("\n--- Distributed Cards ---");
        for (int i = 0; i < playerHands.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < playerHands[i].length; j++) {
                System.out.print(playerHands[i][j] + (j == playerHands[i].length - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }
}