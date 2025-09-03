import java.util.Scanner;

public class CartItem {
	private String itemName;
	private double price;
	private int quantity;

	public CartItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public void addItem(int quantityToAdd) {
		if (quantityToAdd > 0) {
			this.quantity += quantityToAdd;
			System.out.println("Added " + quantityToAdd + " of " + this.itemName + " to the cart.");
		} else {
			System.out.println("Quantity to add must be positive.");
		}
	}

	public void removeItem(int quantityToRemove) {
		if (quantityToRemove <= 0) {
			System.out.println("Quantity to remove must be positive.");
		} else if (quantityToRemove > this.quantity) {
			System.out.println("Cannot remove " + quantityToRemove + " of " + this.itemName + ". Only " + this.quantity + " in cart.");
		} else {
			this.quantity -= quantityToRemove;
			System.out.println("Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
		}
	}

	public double totalCost() {
		return this.price * this.quantity;
	}

	public void displayItem() {
		System.out.println("\n--- Current Cart ---");
		System.out.println("Item: " + this.itemName);
		System.out.println("Price per item: $" + this.price);
		System.out.println("Quantity: " + this.quantity);
		System.out.printf("Total Cost: $%.2f\n", this.totalCost());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- Setup Your Shopping Cart Item ---");
		System.out.print("Enter item name: ");
		String name = scanner.nextLine();
		System.out.print("Enter price per item: ");
		double price = scanner.nextDouble();
		System.out.print("Enter initial quantity: ");
		int quantity = scanner.nextInt();

		CartItem item = new CartItem(name, price, quantity);
		int choice;

		do {
			item.displayItem();
			System.out.println("\n--- Cart Menu ---");
			System.out.println("1. Add items");
			System.out.println("2. Remove items");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter quantity to add: ");
					int qtyToAdd = scanner.nextInt();
					item.addItem(qtyToAdd);
					break;
				case 2:
					System.out.print("Enter quantity to remove: ");
					int qtyToRemove = scanner.nextInt();
					item.removeItem(qtyToRemove);
					break;
				case 3:
					System.out.println("Finalizing your cart. Thank you!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 3);
		
		item.displayItem();
		scanner.close();
	}
}