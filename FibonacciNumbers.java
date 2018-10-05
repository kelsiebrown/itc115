// ITC 115 - Fall 2018
// Assignment 2: use a for loop to calculate and print out the first 12 Fibonacci numbers

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < 12; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(a + "  ");
		}

	}

}
