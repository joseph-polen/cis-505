/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class to hand transaction I/O
 */

public class TransactionIO {

	private static final String FILE_NAME = "expenses.txt";
	private static File file = new File(FILE_NAME);

	/**
	 * No argument constructor
	 */
	public TransactionIO() {
		super();
	}

	/**
	 * Method for inserting transactions from file
	 * 
	 * @param transactions
	 * @throws IOException
	 */
	public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
		PrintWriter output = null;

		if (file.exists()) {
			output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
		} else {
			output = new PrintWriter(FILE_NAME);
		}

		for (Transaction tran : transactions) {
			output.print(tran.getDate() + " ");
			output.print(tran.getDescription() + " ");
			output.print(tran.getAmount() + " ");
		}

		output.close();

	}

	/**
	 * Method for iterating over transactions arraylist
	 * 
	 * @return transactions array
	 * @throws IOException
	 */
	public static ArrayList<Transaction> findAll() throws IOException{
		
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		Scanner input = new Scanner(file);
		Transaction trans = new Transaction();
		
		//Iterate over input file
		while(input.hasNext()) {

			
			//set description
			trans.setDescription(input.next());
			
			//set amount
			if(input.hasNextDouble()) {
				trans.setAmount(input.nextDouble());

			}

		}
		
		//add transaction
		transactions.add(trans);

		
		//close input file
		input.close();

		return transactions;
	}

}