/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

/**
 * @author Joe Polen 
 * CIS-505 Bellevue University
 * 
 * Class for bowling balls, extends Product class
 */

public class Ball extends Product {
	
	//ball color string
	private String color = "";

	/**
	 * No argument constructor
	 */
	public Ball() {
		super();
	}
	
	/**
	 * Color getter
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * Color setter
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
    /**
     *Overridden toString() method. Returns color of bowling ball appended to Product class toString.
     */
    @Override
    public String toString(){
    	return super.toString() + "\n  Color: " + this.color + "\n\n";
    }

}