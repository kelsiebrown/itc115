import java.text.NumberFormat;

// Each BankAccount object represents one user's account
// information including name and balance of money

public class BankAccount {
	
	// fields
	private String name;
	private double balance;
	private double transactionFee = 0.00;
	
	// constructor
	public BankAccount(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		this.transactionFee = transactionFee;
	}
	
	// getter and setter methods for transaction fee
	public double getFee() {
		return this.transactionFee;
	}
	
	public void changeFee(double newFee) {
		this.transactionFee = newFee;
	}
	
	// method to deposit money
	public void deposit (double amount) {
		balance += amount;
	}
	
	// method to withdraw money
	public void withdraw (double amount) {
		if (balance < amount) {
			System.out.print("");
		} else {
			balance -= amount;
		}
	}
	
	// format balance and display bank account info as string
	public String formatBalance() {
        String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
        return formattedBalance;
	}
	
	public String toString() {
		return name + ", " + formatBalance() + ".";
	}
}
