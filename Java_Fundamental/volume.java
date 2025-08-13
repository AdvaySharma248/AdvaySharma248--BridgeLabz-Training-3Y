import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + vol);
        sc.close();
    }
}
