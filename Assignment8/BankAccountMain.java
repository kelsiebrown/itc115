// client for BankAccount class

public class BankAccountMain {

	public static void main(String[] args) {

			BankAccount joe = new BankAccount("Joe", 2397.23, 3.00);
			BankAccount elizabeth = new BankAccount("Elizabeth", 93.34, 5.00);
			
			// edit transaction fee
			joe.setTransactionFee(3.50);
			
			// make a deposit
			joe.deposit(329.57);
			elizabeth.deposit(20.00);
			
			// withdraw money
			joe.withdraw(100.00);
			elizabeth.withdraw(120.00);
			
			// print results
			System.out.println(elizabeth.toString());
			System.out.println();
			System.out.println(joe.toString());
			System.out.println();			
		
	}

}
