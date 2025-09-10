import java.util.Scanner;

public class BankAccount {

    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account instance.");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Create Bank Account 1 ---");
        System.out.print("Enter Account Holder Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accNum1 = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal1 = scanner.nextDouble();
        scanner.nextLine(); 
        BankAccount account1 = new BankAccount(name1, accNum1, bal1);

        System.out.println("\n--- Create Bank Account 2 ---");
        System.out.print("Enter Account Holder Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accNum2 = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal2 = scanner.nextDouble();
        scanner.nextLine();
        BankAccount account2 = new BankAccount(name2, accNum2, bal2);

        System.out.println("\n--- Account Details ---");
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();
        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();
        
        System.out.println();
        BankAccount.getTotalAccounts();

        System.out.println("\n--- Transactions for Account 1 ---");
        System.out.print("Enter amount to deposit for Account 1: ");
        double depositAmount1 = scanner.nextDouble();
        account1.deposit(depositAmount1);
        
        System.out.print("Enter amount to withdraw for Account 1: ");
        double withdrawAmount1 = scanner.nextDouble();
        account1.withdraw(withdrawAmount1);
        
        System.out.println("\nUpdated Account 1 Details:");
        account1.displayAccountDetails();
        
        System.out.println("\n--- Transactions for Account 2 ---");
        System.out.print("Enter amount to deposit for Account 2: ");
        double depositAmount2 = scanner.nextDouble();
        account2.deposit(depositAmount2);

        System.out.print("Enter amount to withdraw for Account 2: ");
        double withdrawAmount2 = scanner.nextDouble();
        account2.withdraw(withdrawAmount2);
        
        System.out.println("\nUpdated Account 2 Details:");
        account2.displayAccountDetails();

        scanner.close();
    }
}
