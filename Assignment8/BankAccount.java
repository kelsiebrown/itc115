// Each BankAccount object represents one user's account
// information including name and balance of money

import java.text.NumberFormat;

public class BankAccount {
	
	// fields
	private String name;
	private double balance;
	private double transactionFee;
	
	// constructor
	public BankAccount(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		transactionFee = 0.00;
	}
	
	// getter and setter methods
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
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
// Each BankAccount object represents one user's account
// information including name and balance of money

import java.text.NumberFormat;

public class BankAccount {
	
	// fields
	private String name;
	private double balance;
	private double transactionFee;
	
	// constructor
	public BankAccount(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		transactionFee = 0.00;
	}
	
	// getter and setter methods
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
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
