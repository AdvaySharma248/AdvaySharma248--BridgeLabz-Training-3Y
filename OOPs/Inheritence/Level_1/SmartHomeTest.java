package com.bridgelabz.inheritance;
class Device {
    String deviceId; String status;
    Device(String id, String status) { this.deviceId=id; this.status=status; }
}
class Thermostat extends Device {
    int temperature;
    Thermostat(String id, String status, int temperature) {
        super(id,status); this.temperature=temperature;
    }
    void displayStatus() {
        System.out.println("Device: " + deviceId + ", Status: " + status + ", Temp: " + temperature);
    }
}
public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T1","On",24);
        t.displayStatus();
    }
}
