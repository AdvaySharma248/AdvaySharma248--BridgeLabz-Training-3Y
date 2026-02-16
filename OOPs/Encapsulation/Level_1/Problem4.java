public class Problem4 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[] {
            new SavingsAccount("S001","Raj",10000),
            new CurrentAccount("C001","Priya",5000)
        };
        accounts[0].deposit(2000);
        accounts[1].withdraw(1000);
        for (BankAccount a : accounts) {
            System.out.println(a.getHolderName() + " Balance: " + a.getBalance() + " Interest: " + a.calculateInterest());
        }
        Loanable loanable = new SavingsAccount("S002","Maya",20000);
        System.out.println(loanable.applyForLoan(15000));
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String no, String name, double bal) { this.accountNumber=no; this.holderName=name; this.balance=bal; }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { if(amount>0) balance += amount; }
    public boolean withdraw(double amount) { if(amount>0 && amount<=balance) { balance -= amount; return true; } return false; }
    protected void setBalance(double b){ this.balance = b; }

    public abstract double calculateInterest();
}

interface Loanable {
    String applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String no, String name, double bal) { super(no,name,bal); }
    @Override
    public double calculateInterest() { return getBalance() * 0.04; } // 4% simple
    @Override
    public String applyForLoan(double amount) {
        return calculateLoanEligibility(amount) ? "Loan Approved" : "Loan Denied";
    }
    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= amount * 0.2; // must have 20% of amount
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String no, String name, double bal) { super(no,name,bal); }
    @Override
    public double calculateInterest() { return 0; } // no interest on current
}
