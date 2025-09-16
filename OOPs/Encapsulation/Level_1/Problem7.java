public class Problem7 {
    public static void main(String[] args) {
        Patient[] patients = new Patient[] {
            new InPatient(101,"Anita",30,5,2000),
            new OutPatient(102,"Soham",25)
        };
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: " + p.calculateBill());
            System.out.println("----");
        }
    }
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    public Patient(int id,String name,int age){ this.patientId=id; this.name=name; this.age=age; }
    public int getPatientId(){ return patientId; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public String getPatientDetails(){ return "["+patientId+"] "+name+" (age "+age+")"; }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String note);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private double ratePerDay;
    private String records = "";
    public InPatient(int id,String name,int age,int days,double ratePerDay){ super(id,name,age); this.days=days; this.ratePerDay=ratePerDay; }
    @Override
    public double calculateBill(){ return days * ratePerDay + 500; } // plus fixed charges
    @Override
    public void addRecord(String note){ records += note + "\n"; }
    @Override
    public String viewRecords(){ return records.isEmpty() ? "No records" : records; }
}

class OutPatient extends Patient implements MedicalRecord {
    private String records = "";
    public OutPatient(int id,String name,int age){ super(id,name,age); }
    @Override
    public double calculateBill(){ return 300; } // consultation fee
    @Override
    public void addRecord(String note){ records += note + "\n"; }
    @Override
    public String viewRecords(){ return records.isEmpty() ? "No records" : records; }
}
