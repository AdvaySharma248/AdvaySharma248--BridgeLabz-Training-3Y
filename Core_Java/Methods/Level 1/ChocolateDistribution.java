import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findDistribution(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            System.out.println("Error: Cannot distribute among zero children.");
            return new int[]{0, numberOfChocolates};
        }
        int eachGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();

        int[] result = findDistribution(chocolates, children);

        if (children != 0) {
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}
