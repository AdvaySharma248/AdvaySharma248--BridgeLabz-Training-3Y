public class Problem8 {
    public static void main(String[] args) {
        RideVehicle[] vehicles = new RideVehicle[] {
            new CarRide("V1","Raju",12),
            new BikeRide("V2","Siva",6),
            new AutoRide("V3","Kiran",8)
        };
        double distance = 10; // km
        for (RideVehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println("----");
        }
    }
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public RideVehicle(String id,String driver,double rate){ this.vehicleId=id; this.driverName=driver; this.ratePerKm=rate; }
    public String getVehicleId(){ return vehicleId; }
    public String getDriverName(){ return driverName; }
    protected double getRatePerKm(){ return ratePerKm; }
    public String getVehicleDetails(){ return vehicleId + " driven by " + driverName + " @ " + ratePerKm + "/km"; }
    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLoc);
}

class CarRide extends RideVehicle implements GPS {
    private String location = "Unknown";
    public CarRide(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double distance){ return getRatePerKm() * distance + 20; } // base fee
    @Override public String getCurrentLocation(){ return location; }
    @Override public void updateLocation(String newLoc){ location = newLoc; }
}

class BikeRide extends RideVehicle implements GPS {
    private String location = "Unknown";
    public BikeRide(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double distance){ return getRatePerKm() * distance; }
    @Override public String getCurrentLocation(){ return location; }
    @Override public void updateLocation(String newLoc){ location = newLoc; }
}

class AutoRide extends RideVehicle implements GPS {
    private String location = "Unknown";
    public AutoRide(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double distance){ return getRatePerKm() * distance + 10; }
    @Override public String getCurrentLocation(){ return location; }
    @Override public void updateLocation(String newLoc){ location = newLoc; }
}
