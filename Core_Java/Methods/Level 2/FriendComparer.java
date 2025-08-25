import java.util.Scanner;

public class FriendComparer {

    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngestFriend = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallestFriend = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (e.g., in cm): ");
            heights[i] = scanner.nextDouble();
        }

        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
