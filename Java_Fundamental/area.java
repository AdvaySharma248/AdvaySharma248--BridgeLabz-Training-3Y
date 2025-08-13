import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double ar = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + ar);
        sc.close();
    }
}
