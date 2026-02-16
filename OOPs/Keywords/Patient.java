import java.util.Scanner;

public class Patient {
    private static String hospitalName;
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientID() {
        return patientID;
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Hospital Name: ");
        String hospName = scanner.nextLine();
        Patient.setHospitalName(hospName);

        System.out.println("\n--- Enter Details for Patient 1 ---");
        System.out.print("Enter Patient ID: ");
        String id1 = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Ailment: ");
        String ailment1 = scanner.nextLine();
        Patient patient1 = new Patient(name1, age1, ailment1, id1);

        System.out.println("\n--- Enter Details for Patient 2 ---");
        System.out.print("Enter Patient ID: ");
        String id2 = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Ailment: ");
        String ailment2 = scanner.nextLine();
        Patient patient2 = new Patient(name2, age2, ailment2, id2);
        
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
        
        System.out.println("\n--- Patient 1 Details ---");
        patient1.displayPatientDetails();
        System.out.println();
        System.out.println("--- Patient 2 Details ---");
        patient2.displayPatientDetails();
        
        scanner.close();
    }
}
