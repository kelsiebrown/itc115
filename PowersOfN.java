// ITC 115 - Fall 2018
// Write a method that accepts a base and an exponent as arguments 
// and prints each power of the base from base^0 up to that maximum power


public class PowersOfN {

	// call the method
	public static void main(String[] args) {
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
	}
	
	// create method for printing powers of a given number using math library
	public static void printPowersOfN(int base, int exponent) {
		for (int i = 0; i <= exponent; i++) {
			int number = (int) Math.pow(base, i);   // Math.pow returns double; convert to int before printing
			System.out.print(number + "  ");
		}
		
		// separate individual calls
		System.out.println();
	}
}
