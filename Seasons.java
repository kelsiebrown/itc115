// ITC 115 - Fall 2018 - Assignment 4
// This program determines which season it is based on user input
// of numeric month and day values

import java.util.Scanner;

public class Seasons {
	
	public static void main(String[] args) {
		// print introduction
		System.out.println("This program determines the current season based");
		System.out.println("on user input of numeric month and day.");
		System.out.println();
		
		// create Scanner console
		Scanner console = new Scanner(System.in);
		
		// initialize season variable
		String season = null;
		
		// get user input month and date
		System.out.print("Enter the month in numeric format (1-12): ");
		int month = console.nextInt();
		System.out.print("Enter the day in numeric format (1-31): ");
		int date = console.nextInt();
		
		// determine season based on user input		
		if ((month == 12 && date >= 16) || month == 1 || month == 2 || (month == 3 && date <= 15)){
			season = "winter";
		} else if ((month == 3 && date >= 16) || month == 4 || month == 5 || (month == 6 && date <= 15)){
			season = "spring";
		} else if ((month == 6 && date >= 16) || month == 7 || month == 8 || (month == 9 && date <= 15)) {
			season = "summer";
		} else if (( month == 9 && date >= 16) || month == 10 || month == 11 || (month == 12 && date <= 15)) {
			season = "fall";
		}
		
		// print the result
		System.out.println();
		System.out.println("The season is " + season + ".");
	}	
	
}
