// client for BankAccount class

public class BankAccountMain {

	public static void main(String[] args) {

			BankAccount joe = new BankAccount("Joe", 2397.23, 0.00);
			BankAccount elizabeth = new BankAccount("Elizabeth", 93.34, 0.00);
			
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
