/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Purton, I. (2013, February 21). How to convert current date into string in Java? 
Stack Overflow. Retrieved October 2, 2022, from 
https://stackoverflow.com/questions/2942857/how-to-convert-current-date-into-string-in-java 
*/

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class to handle transactions
 */

public class Transaction {

	private String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
	private String description = "";
	private double amount = 0;

	/**
	 * No argument constructor
	 */
	public Transaction() {
		super();
	}
	
	/**
	 * 2 Argument constructor
	 * 
	 * @param description
	 * @param amount
	 */
	public Transaction(String description, double amount) {
		this.description = description;
		this.amount = amount;
	}

	/**
	 * 3 Argument constructor
	 * 
	 * @param date
	 * @param description
	 * @param amount
	 */
	public Transaction(String date, String description, double amount) {
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	/**
	 * Date getter
	 * 
	 * @return date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * Description getter
	 * 
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Amount getter
	 * 
	 * @return amount
	 */
	public double getAmount() {
		return this.amount;
	}

	/**
	 * Date setter
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Description setter
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Amount setter
	 * 
	 * @param amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * Overridden toString() method. Gives transaction description when called.
	 */
	@Override
	public String toString() {
		System.out.printf(
				"\n\n  Date: " + this.date + '\n' + "  Description: " + this.description + "\n" + "  Amount: $%,6.2f",
				this.amount);
		return "";
	}

}
