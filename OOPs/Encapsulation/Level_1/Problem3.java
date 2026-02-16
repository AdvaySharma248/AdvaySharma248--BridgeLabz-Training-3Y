public class Problem3 {
    public static void main(String[] args) {
        Vehicle[] list = new Vehicle[] {
            new Car("KA-01-1234", 2000),
            new Bike("KA-02-2222", 500),
            new Truck("KA-03-3333", 5000)
        };
        int days = 3;
        for (Vehicle v : list) {
            System.out.println(v.getVehicleNumber() + " (" + v.getType() + ")");
            System.out.println("Rental for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails() + ", Insurance: " + ((Insurable)v).calculateInsurance());
            }
            System.out.println("----");
        }
    }
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    protected double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNo = "CAR-POL-123"; // encapsulated
    public Car(String num, double rate) { super(num,"Car",rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 300; }
    @Override
    public String getInsuranceDetails() { return "Car Insurance Policy: " + policyNo; }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num,"Bike",rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; } // discount
}

class Truck extends Vehicle implements Insurable {
    private String policyNo = "TRK-POL-789";
    public Truck(String num, double rate) { super(num,"Truck",rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; } // heavier rate
    @Override
    public double calculateInsurance() { return 1000; }
    @Override
    public String getInsuranceDetails() { return "Truck Insurance Policy: " + policyNo; }
}
