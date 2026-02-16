import java.util.Scanner;

class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }
    
    public void displaySavingsAccountDetails() {
        System.out.println("--- Savings Account Details ---");
        System.out.println("Account Number (from public): " + accountNumber);
        System.out.println("Account Holder (from protected): " + accountHolder);
        System.out.println("Balance (via public getter): " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for a Bank Account:");
        System.out.print("Account Number: ");
        long accNum = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String holderName = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(accNum, holderName, balance);
        System.out.println("\n--- Initial Account Details ---");
        account.displayAccountDetails();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        
        System.out.println("\nFinal Balance: " + account.getBalance());

        System.out.println("\nEnter details for a Savings Account:");
        System.out.print("Account Number: ");
        long savingsAccNum = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String savingsHolderName = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double savingsBalance = scanner.nextDouble();
        System.out.print("Interest Rate: ");
        double interest = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(savingsAccNum, savingsHolderName, savingsBalance, interest);
        System.out.println();
        savingsAccount.displaySavingsAccountDetails();
        
        scanner.close();
    }
}
