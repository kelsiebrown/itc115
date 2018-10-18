// ITC 115 - Fall 2018
// Assignment 4

/* 
 Write a method called season that takes as parameters two integers representing a month and day and returns 
 an integer between 1 and 12 (1 for January, 2 for February, etc.) and that the day of the  month is a number 
 between 1 and 31. If the date falls between 12/16 and 3/15, the method should return "winter". If the date
 falls between 3/16 and 6/15, the method should return "spring". If the date falls between 6/16 and 9/15, the 
 method should return "summer". And if the date falls between 9/16 and 12/15, the method should return "fall".
 */

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		String season = null;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the month in numeric format (0-12): ");
		int month = console.nextInt();
		System.out.print("Enter the day in numeric format (0-31): ");
		int date = console.nextInt();
		
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
		System.out.println("The season is " + season);

	}

}
