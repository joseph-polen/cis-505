 /*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.util.Date;
import java.text.SimpleDateFormat; 

/**
 * @author Joe Polen
 * CIS-505
 * Bellevue University
 * 
 *Class to store account information
 */
public class Account {
	//variable for balance of account
	private double balance = 0;
	
	
	
	/**
	 * Balance getter
	 * @return balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Method for depositing funds
	 * @param amt - amount to deposit
	 */
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	/**
	 * Method for withdrawing funds
	 * @param amt - amount to withdraw
	 */
	public void withdraw(double amt) {
		this.balance -= amt;
	}
	
	/**
	 * Method for displaying Menu
	 */
	public void displayMenu() {
		System.out.printf("\n  Account Menu \n");
		System.out.printf("  Enter <D/d> for deposit \n");
		System.out.printf("  Enter <W/w> for withdraw \n");
		System.out.printf("  Enter <B/b> for balance \n");
		System.out.printf("    Enter option>: ");
		
	}
	
	/**
	 * Method for returning the current date
	 * @return formatted date
	 */
	public String getTransactionDate() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); 
		return dateFormat.format(date);		
	}
}
			