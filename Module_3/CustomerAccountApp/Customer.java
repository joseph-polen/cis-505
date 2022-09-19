/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/


/**
 * @author Joe Polen
 * CIS-505
 * Bellevue University
 * 
 *Class to store a customer
 */
public class Customer {
	private String name = "";
	private String address = "";
	private String city = "";
	private String zip = "";
	
	/**
	 * No argument constructor
	 */
	public Customer() {
		super();
	}
	
	/**
	 * Argument constructor
	 * @param name - name of customer
	 * @param address - address of customer
	 * @param city - city of customer
	 * @param zip - zip of cusomter
	 */
	public Customer(String name, String address, String city, String zip) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.zip = zip;
	}
	
	/**
	 * Name getter
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Address getter
	 * @return address
	 */
	public String getaddress() {
		return address;
	}
	
	/**
	 * City getter
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Zip getter
	 * @return address
	 */
	public String getZip() {
		return zip;
	}
	
    /**
     *Overridden toString() method. Returns description of customer.
     */
    @Override
    public String toString(){
    	return "  Name: " + this.name + "\n  Address: " + this.address + "\n  City: " + this.city + "\n  Zip: " + this.zip;
    }	  
}
			