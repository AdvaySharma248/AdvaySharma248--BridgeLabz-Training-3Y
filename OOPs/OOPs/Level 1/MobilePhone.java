import java.util.Scanner;

public class MobilePhone {
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void diplayMobile() {
		System.out.println("\n--- Mobile Phone Details ---");
		System.out.println("Brand of mobile: " + brand);
		System.out.println("Model of mobile: " + model);
		System.out.println("Price of mobile: " + price);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter mobile brand: ");
		String brand = scanner.nextLine();
		
		System.out.print("Enter mobile model: ");
		String model = scanner.nextLine();
		
		System.out.print("Enter mobile price: ");
		double price = scanner.nextDouble();
		
		MobilePhone mobile = new MobilePhone(brand, model, price);
		mobile.diplayMobile();
		
		scanner.close();
	}
}