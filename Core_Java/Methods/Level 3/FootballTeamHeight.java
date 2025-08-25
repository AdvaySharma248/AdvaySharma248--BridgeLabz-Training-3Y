import java.util.Arrays;
import java.lang.Math;

public class FootballTeamHeight {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; 
        }
        return heights;
    }

    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        return (double) sumOfHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int tallestHeight(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] playerHeights = generateRandomHeights(11);

        System.out.println("Player heights (in cm): " + Arrays.toString(playerHeights));

        int shortest = shortestHeight(playerHeights);
        int tallest = tallestHeight(playerHeights);
        double mean = meanHeight(playerHeights);

        System.out.println("Shortest player's height: " + shortest + " cm");
        System.out.println("Tallest player's height: " + tallest + " cm");
        System.out.printf("Mean height of the team: %.2f cm%n", mean);
    }
}
