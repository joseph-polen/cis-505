/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

/**
 * @author Joe Polen 
 * CIS-505 Bellevue University
 * 
 * Class to represent products
 */

public class Product {

	//string for product code
	private String code = "";
	
	//string for product description
	private String description = "";
	
	//double for product price
	private double price = 0;

	/**
	 * No argument constructor
	 */
	public Product() {
		super();
	}
	
	/**
	 * 
	 * @param code
	 * @param description
	 * @param price
	 */
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

	/**
	 * Code getter
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Description getter
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Price getter
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	

	/**
	 * Code setter
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}


	/**
	 * Description setter
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Price setter
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
    /**
     *Overridden toString() method. Gives product description when called.
     */
    @Override
    public String toString(){
    	System.out.printf("  Product code: " + this.code + '\n' + "  Description: " + this.description + "\n" + "  Price: $%,6.2f",this.price);
    	return "";
    }

}