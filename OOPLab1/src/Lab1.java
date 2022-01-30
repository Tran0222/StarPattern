/* Student Name: Jennifer Tran
 * Lab Professor: Howard Rosenblum
 * Due Date: January 15,2022
 * Description: This class will hold 2 working methods: 
 * 1)displays 4 different star patterns 2) allows inputs from user to display a butterfly star pattern.
*/

import java.util.Scanner;

// this class will hold 2 working methods
public class Lab1 {

	/*
	 * this working method outputs 4 different star patterns: star patterns 1 & 2
	 * uses nested for loops star patterns 3 & 4 uses for loops, if else
	 */
	public void printPattern(int n) {
		// star pattern 1
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// star pattern 2
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// star pattern 3
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i)
					System.out.print(" ");

				else
					System.out.print("*");
			}
			System.out.println();
		}

		// star pattern 4
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {

				if (i < j)
					System.out.print(" ");

				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

// This working method will allow the user to prompt the use for inputs for height to output a butterfly pattern or exit the program 
	public void printPattern() {

		Scanner input = new Scanner(System.in);
		int height = 0;

		do {
			System.out.print("Enter height (-1 to quit): ");
			height = input.nextInt();

			if (height % 2 != 0 && height >= 0 && height < 5) {
				System.out.println("Invalid entry... Must be an odd integer 5 or greater. Please try again. ");

			} else if (height % 2 == 0 && height >= 5 || height % 2 == 0 && height <= 5) {
				System.out.println("Invalid entry... Must be an odd integer 5 or greater. Please try again. ");
			} else if (height % 2 != 0 && height >= 5) {

				// code for star pattern
				// first section: 2 triangles with full line
				for (int i = 1; i <= height; i += 2) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					// -1 to keep the line closed
					for (int k = i; k <= height - 1; k++) {

						System.out.print("  ");
					}
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				// second section: bottom triangles
				for (int i = 3; i <= height; i += 2) {
					for (int j = i; j <= height; j++) {
						System.out.print("*");
					}
					for (int k = 1; k <= i - 1; k++) {
						System.out.print("  ");
					}
					for (int j = i; j <= height; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			// while height is not -1 exit program
		} while (height != -1);
		System.out.println("Goodbye.... Have a nice day!");

	}
} // end of class
