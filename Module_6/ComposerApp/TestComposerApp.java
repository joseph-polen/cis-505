/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.util.List;
import java.util.Scanner;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class to test the Composer App
 */

public class TestComposerApp {

	public static void main(String[] args) {

		//Create MemComposerDao object and list of composers
		MemComposerDao memory = new MemComposerDao();
		List<Composer> composers;

		// Scanner for y/n
		Scanner scan = new Scanner(System.in);

		System.out.printf("Welcome to the Composer App");

		//While loop that always runs until system exit in option 4
		while (true) {

			displayMenu();
			String input = scan.nextLine();

			// If user selects option 1
			if (input.equals("1")) {

				System.out.println("\n\n  --Displaying Composers--");

				composers = memory.findAll();
				for (Composer composer : composers) {
					composer.toString();
				}

			// if user selects option 2
			} else if (input.equals("2")) {

				//Prompt for ID and create a composer that is assigned the returned value of findBy()
				System.out.printf("\n\n  Enter an id: ");
				Integer id = Integer.parseInt(scan.nextLine());
				Composer composer = memory.findBy(id);
				composer.toString();

			// if user selects option 3
			} else if (input.equals("3")) {

				Composer composer = new Composer();

				//Prompt composer information from user and set composer details
				System.out.printf("\n  Enter an id: ");
				composer.setId(Integer.parseInt(scan.nextLine()));
				System.out.printf("  Enter a name: ");
				composer.setName(scan.nextLine());
				System.out.printf("  Enter a genre: ");
				composer.setGenre(scan.nextLine());

				//Insert the composer using the insert() method
				memory.insert(composer);

			// if user selects option 4
			} else if (input.equals("4")) {

				//Exit program and close scanner
				System.out.println("  End of line...");
				scan.close();
				System.exit(0);

			}

		}

	}

	/**
	 * Method for displaying Menu
	 */
	public static void displayMenu() {
		System.out.printf("\n\n  MENU OPTIONS \n");
		System.out.printf("   1. View Composers \n");
		System.out.printf("   2. Find Composer \n");
		System.out.printf("   3. Add Composer \n");
		System.out.printf("   4. Exit \n\n");
		System.out.printf("  Please choose an option: ");

	}
}
