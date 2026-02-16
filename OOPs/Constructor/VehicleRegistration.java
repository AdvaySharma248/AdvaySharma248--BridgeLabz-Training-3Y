import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 250.0; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("--- Vehicle Details ---");
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Fee must be a positive value.");
        }
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Registering Vehicle 1 ---");
        System.out.print("Enter owner name: ");
        String owner1 = scanner.nextLine();
        System.out.print("Enter vehicle type (e.g., Car, Bike): ");
        String type1 = scanner.nextLine();
        Vehicle v1 = new Vehicle(owner1, type1);
        
        System.out.println("\n--- Registering Vehicle 2 ---");
        System.out.print("Enter owner name: ");
        String owner2 = scanner.nextLine();
        System.out.print("Enter vehicle type (e.g., Car, Bike): ");
        String type2 = scanner.nextLine();
        Vehicle v2 = new Vehicle(owner2, type2);

        System.out.println("\n--- Displaying Initial Details ---");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        System.out.print("\nEnter new registration fee to update for all vehicles: ");
        double newFee = scanner.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        System.out.println("\n--- Displaying Details After Fee Update ---");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        scanner.close();
    }
}
