/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.util.Scanner;

/**
 * @author Joe Polen
 * CIS-505
 * Bellevue University
 * 
 * Class for testing the Customer Account App
 */
public class TestCustomerAccountApp {

	public static void main(String[] args) {
		//Create scanner for user input
		Scanner scan = new Scanner(System.in);
		
		//String for controlling continue loop
		String cont = "y";
		
		//Ask user for a customer number with scanner
		System.out.printf("  Enter a customer ID: \n");
		System.out.printf("    ex: 1007, 1008, 1009>: ");
		
		//Get customer ID from user and create customer object
	    String customerID = scan.nextLine();
	    Integer customerInt = new Integer(customerID);
	    Customer customer = CustomerDB.getCustomer(customerInt);
	    
	    //Create an account object
	    Account account = new Account();
	    
	    
	    //Loop while cont = y
	    while(cont.equals("y")) {
	    	//Display the menu and get user input
		    account.displayMenu();
		    String option = scan.nextLine();
		    
		    //If block for user menu. D for deposit. Call account.deposit
		    if((option.equals("D")) || (option.equals("d"))) {
		    	System.out.printf("\n  Enter deposit amount: ");
		    	double deposit = Double.parseDouble(scan.nextLine());
		    	account.deposit(deposit);
		    //W for withdraw. Call account.withdraw
		    }else if((option.equals("W")) || (option.equals("w"))) {
		    	System.out.printf("\n  Enter withdraw amount: ");
		    	double withdraw = Double.parseDouble(scan.nextLine());
		    	account.withdraw(withdraw);	
		    //B for balance. Call account.getBalance.
		    }else if((option.equals("B")) || (option.equals("b"))) {
		    	System.out.printf("\n  Account Balance: $%,6.2f",account.getBalance()); 
		    	System.out.printf("\n");
		    //All other invalid inputs
		    }else {
		    	System.out.printf("\n Error: Invalid option \n\n");
		    }	 
		    
		    //Ask user to continue
		    System.out.printf("\n  Continue? (y/n): ");
		    cont = scan.nextLine();
		    
	    }
	   
	    //Print customer details after exiting loop
	    System.out.println("\n  --Customer Details-- \n" + customer.toString());
	    System.out.printf("\n  Balance as of " + account.getTransactionDate() + " is ");
	    System.out.printf("$%,6.2f",account.getBalance());
	    System.out.printf("\n\n  End of line...");
	}
}
