// ITC 115 - Fall 2018
// Write a method called makeGuesses that guesses numbers between 
// 1-50 inclusive until it makes a guess of at least 48. It should 
// report each guess and at the end the total number of guesses.

import java.util.Random;

public class Guesses {

	public static void main(String[] args) {
		makeGuesses();
	}

	private static void makeGuesses() {
		// start randomization
		Random rand = new Random();
		int randomNumber = rand.nextInt(50) + 1;    // random numbers from 1-50
		int counter = 1;    // start counter
		
		// while loop to continue randomization
		while (randomNumber < 48) {
			System.out.println("guess = " + randomNumber);
			randomNumber = rand.nextInt(50) + 1;
			counter++;
		}
		
		// print the result
		System.out.println("guess = " + randomNumber);    // fencepost solution to print last number
		System.out.println("total guesses = " + counter);
	}

}
