import java.util.Scanner;

public class BankAccount {
	private String accountHolder;
	private String accountNumber;
	private double balance;

	public BankAccount(String accountHolder, String accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited: $" + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance for this withdrawal.");
		} else {
			balance -= amount;
			System.out.println("Successfully withdrew: $" + amount);
		}
	}

	public void displayBalance() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: $" + balance);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- Welcome to the Bank ---");
		System.out.print("Enter account holder's name: ");
		String name = scanner.nextLine();
		System.out.print("Enter account number: ");
		String number = scanner.nextLine();
		System.out.print("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();

		BankAccount account = new BankAccount(name, number, initialBalance);
		int choice;

		do {
			System.out.println("\n--- ATM Menu ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					break;
				case 2:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = scanner.nextDouble();
					account.withdraw(withdrawAmount);
					break;
				case 3:
					account.displayBalance();
					break;
				case 4:
					System.out.println("Thank you for banking with us!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}