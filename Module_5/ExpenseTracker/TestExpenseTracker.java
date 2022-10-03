/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class to test the expense tracker
 */

public class TestExpenseTracker {

	public static void main(String[] args) throws IOException {
		
		//Scanner for y/n
		Scanner scan = new Scanner(System.in);
		
		//Scanner for user transaction input
		Scanner sc = new Scanner(System.in);
		TestExpenseTracker menu = new TestExpenseTracker();
		double monthlyExpense = 0;
		

		// String for controlling continue loop
		String cont = "y";

		// Loop while cont = y
		while (cont.equals("y")) {

			int input = ValidatorIO.getInt(sc, menu());

			//If user selects option 1
			if (input == 1) {

				ArrayList<Transaction> transactions = new ArrayList<>();
				transactions = TransactionIO.findAll();
				
				for(Transaction transaction : transactions) {
					transaction.toString();
				}
				

			//if user selects option 2 From assignment 5.1 figure 4.3
			} else if (input == 2) {

				String c = "y";
				ArrayList<Transaction> transactions = new ArrayList<>();
				
				while (c.equalsIgnoreCase("y")) {

					String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
					double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

					Transaction transaction = new Transaction(description, amount);

					transactions.add(transaction);

					c = ValidatorIO.getString(sc, "\n  Add another transaction (y/n): ");

					try {
						TransactionIO.bulkInsert(transactions);
					} catch (IOException e) {

						System.out.println("\n  Exception: " + e.getMessage());
					}

				}

				
			//if user selects option 3
			} else if (input == 3) {
				
				ArrayList<Transaction> transactions = new ArrayList<>();
				transactions = TransactionIO.findAll();
				
				//Iterate over transactions array
				for (Transaction transaction : transactions) {
					monthlyExpense += transaction.getAmount();
				}
				
				//Output monthly expenses
				System.out.printf("\n  Your total monthly expense is: ");
				System.out.printf("$%,6.2f",monthlyExpense);

			}

			// Ask user to continue
			System.out.printf("\n\n  Continue? (y/n): ");
			cont = scan.nextLine();

		}

	}

	/**
	 * Method for displaying Menu
	 */
	public static String menu() {
		return ("  Welcome to the Expense Tracker \n \n  MENU OPTIONS \n   1. View Transactions \n   2. Add Transactions \n   3. View Expense \n\n  Please choose an option: ");

	}
}
