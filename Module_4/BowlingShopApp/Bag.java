/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

/**
 * @author Joe Polen 
 * CIS-505 Bellevue University
 * 
 * Class for bowling bags
 */

public class Bag extends Product{
	
	//bag type string
	private String type = "";

	/**
	 * No argument constructor
	 */
	public Bag() {
		super();
	}
	
	/**
	 * Bag type getter
	 * @return type
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * Bag type setter
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
    /**
     *Overridden toString() method. Returns type of bag appended to Product class toString.
     */
    @Override
    public String toString(){
    	return super.toString() + "\n  Type: " + this.type + "\n\n";
    }

}
