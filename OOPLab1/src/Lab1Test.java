/* Student Name: Jennifer Tran
 * Lab Professor: Howard Rosenblum
 * Due Date: January 15,2022
 * Description: This is the main class that will provide outputs and inputs
 * from the user to display a star pattern
*/

/* This class will hold the main method that will:
 * display 4 star patterns and allow the user to input their values for height to display a butterfly star pattern.
 */
public class Lab1Test {

	// This is the main class that will call 2 different methods from Lab1 class.
	public static void main(String[] args) { // start of main
		Lab1 l = new Lab1();
		l.printPattern(10); // with parameter int value, displays 4 star patterns
		l.printPattern(); // without parameter int value,prompts user for height to display a butterfly
							// star pattern or -1 to exit.

	}// end of main

} // end of class
