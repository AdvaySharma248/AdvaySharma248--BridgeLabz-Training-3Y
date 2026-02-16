package com.bridgelabz.inheritance;
class Employee {
    String name; int id; double salary;
    Employee(String name, int id, double salary) {
        this.name = name; this.id = id; this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name,id,salary); this.teamSize = teamSize;
    }
    @Override void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String language;
    Developer(String name, int id, double salary, String language) {
        super(name,id,salary); this.language = language;
    }
    @Override void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}
class Intern extends Employee {
    int duration;
    Intern(String name, int id, double salary, int duration) {
        super(name,id,salary); this.duration = duration;
    }
    @Override void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emps = {
            new Manager("Alice",1,80000,10),
            new Developer("Bob",2,60000,"Java"),
            new Intern("Charlie",3,20000,6)
        };
        for(Employee e: emps) e.displayDetails();
    }
}
