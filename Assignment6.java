// ITC 115 - Fall 2018

// Write a method called isSorted that accepts an array of real numbers as
// a parameter and returns true if the list is in non-decreasing order and
// false otherwise.

// Add a test case for the method.

public class Assignment6 {

	public static void main(String[] args) {

		// test cases
		double[] list1 = {16.1, 12.3, 22.2, 14.14};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		// call the method and print the result
		System.out.println("List 1 sorted: " + isSorted(list1));
		System.out.println("List 2 sorted: " + isSorted(list2));
	}
	
	public static Boolean isSorted(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {  
			if (list[i] > list[i + 1]) {   // check if next number is greater
				return false;    // return false if not ascending
			}
		}
		return true;   // otherwise return true
	}
}
