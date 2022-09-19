/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/


/**
 * @author Joe Polen
 * CIS-505
 * Bellevue University
 * 
 * Class for creating customers based on ID
 *
 */
public class CustomerDB {
	public static Customer getCustomer(Integer id) {
		
		
		//If statements for choosing a customer to create based on ID
		if(id == 1007) {
			Customer customer1 = new Customer("Jim Brooks", "445 Main St.", "Dayton", "45415");
			return customer1;
		}else if(id == 1008) {
			Customer customer2 = new Customer("John Roads", "784 Derry Rd.", "Englewood", "45322");
			return customer2;
		}else if(id == 1009) {
			Customer customer3 = new Customer("Cathy Richardson", "8973 Arlington Ave.", "Brookville", "45400");
			return customer3;
		}else {
			Customer defaultCustomer = new Customer();
			return defaultCustomer;
		}
	}
}
			