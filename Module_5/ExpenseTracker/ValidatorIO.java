/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
rights reserved.
*/

import java.util.Scanner;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class for Validation IO
 */

public class ValidatorIO {

	/**
	 * No argument constructor
	 */
	public ValidatorIO() {
		super();
	}

	/**
	 * Method for validating Integer input, from Assignment 5.1 Figure 2.1
	 * 
	 * @param sc
	 * @param prompt
	 * @return input
	 */
	public static Integer getInt(Scanner sc, String prompt) {
		Integer input = 0;
		boolean isValid = false;

		while (!isValid) {

			System.out.print(prompt);

			if (sc.hasNextInt()) {
				input = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("\n  Error! Invalid integer value.\n");
			}

			sc.nextLine();

		}

		return input;
	}

	/**
	 * Method for validating double input, derived from Assignment 5.1 Figure 2.1
	 * 
	 * @param sc
	 * @param prompt
	 * @return input
	 */
	public static double getDouble(Scanner sc, String prompt) {

		Double input = 0.0;
		boolean isValid = false;

		while (!isValid) {

			System.out.print(prompt);

			if (sc.hasNextDouble()) {
				input = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("\n  Error! Invalid double value.\n");
			}

			sc.nextLine();

		}

		return input;
	}

	/**
	 * Method for validating string input, derived from Assignment 5.1 Figure 2.1
	 * 
	 * @param sc
	 * @param prompt
	 * @return input
	 */
	public static String getString(Scanner sc, String prompt) {

		String input = "";
		System.out.print(prompt);
		input = sc.next();

		return input;
	}

}