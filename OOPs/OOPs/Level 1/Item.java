import java.util.Scanner;

public class Item {
	String itemCode;
	String itemName;
	double price;
	
	Item(String itemName, String itemCode, double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void displayItemDetails() {
		System.out.println("\n--- Item Details ---");
		System.out.println("Item Name: " + itemName);
		System.out.println("Item Code: " + itemCode);
		System.out.println("Item Price: " + price);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Item Name: ");
		String itemName = scanner.nextLine();
		
		System.out.print("Enter Item Code: ");
		String itemCode = scanner.nextLine();
		
		System.out.print("Enter Item Price: ");
		double price = scanner.nextDouble();
		
		Item item = new Item(itemName, itemCode, price);
		item.displayItemDetails();
		
		scanner.close();
	}
}