import java.util.Scanner;

public class Vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. Please enter a non-negative value.");
        }
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("The object is not an instance of the Vehicle class.");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the new registration fee for all vehicles: ");
        double newFee = scanner.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        scanner.nextLine();

        System.out.println("\n--- Enter Details for Vehicle 1 ---");
        System.out.print("Enter Owner Name: ");
        String owner1 = scanner.nextLine();
        System.out.print("Enter Vehicle Type (e.g., Sedan, SUV): ");
        String type1 = scanner.nextLine();
        System.out.print("Enter Registration Number: ");
        String regNum1 = scanner.nextLine();
        Vehicle vehicle1 = new Vehicle(owner1, type1, regNum1);

        System.out.println("\n--- Enter Details for Vehicle 2 ---");
        System.out.print("Enter Owner Name: ");
        String owner2 = scanner.nextLine();
        System.out.print("Enter Vehicle Type (e.g., Sedan, SUV): ");
        String type2 = scanner.nextLine();
        System.out.print("Enter Registration Number: ");
        String regNum2 = scanner.nextLine();
        Vehicle vehicle2 = new Vehicle(owner2, type2, regNum2);

        System.out.println("\n--- Vehicle 1 Registration Details ---");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        System.out.println("--- Vehicle 2 Registration Details ---");
        vehicle2.displayRegistrationDetails();
        
        scanner.close();
    }
}
