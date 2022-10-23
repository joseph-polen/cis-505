/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/


/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class for calculating future value
 */

public class FinanceCalculater {

	public FinanceCalculater() {
		super();
	}
	
	private static int MONTHS_IN_YEAR = 12;
	
	public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
		
		int months = MONTHS_IN_YEAR * years;
		double interestRate = (1 + rate/100);
		double presentValue = monthlyPayment * months;
		double futureValue = presentValue * (Math.pow(interestRate, months));
		
		return futureValue;
	}

}
