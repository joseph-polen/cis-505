/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.util.Scanner;

/**
 * @author Joe Polen 
 * CIS-505 Bellevue University
 * 
 *  Class to test the bowling shop app
 */

public class TestBowlingShopApp {

	public static void main(String[] args) {
		
		//Create scanner for user input and display menu
		Scanner scan = new Scanner(System.in);
		String input = "";
			
		while(!input.equalsIgnoreCase("x")) {
			
			//display the menu
			displayMenu();
			
			//get input from user
			input = scan.nextLine();
			
			//create product queue
		    GenericQueue products = ProductDB.getProducts(input);
		
		    //iterate through products and display
		    while (products.size() > 0) {
			    System.out.print(products.dequeue().toString());
		    }
		}
		

		
		


	}
	
	/**
	 * Method for displaying Menu
	 */
	public static void displayMenu() {
		System.out.printf("\n  MENU OPTIONS \n");
		System.out.printf("   1. <b> Bowling Balls \n");
		System.out.printf("   2. <a> Bags \n");
		System.out.printf("   3. <s> Shoes \n");
		System.out.printf("   4. <x> To exit \n\n");
		System.out.printf("  Please choose an option: ");
		
	}
}
