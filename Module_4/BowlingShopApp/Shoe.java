/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

/**
 * @author Joe Polen 
 * CIS-505 Bellevue University
 * 
 * Class for bowling shoes
 */

public class Shoe extends Product{
	
	//shoe size double
	private double size = 0;

	/**
	 * No argument constructor
	 */
	public Shoe() {
		super();
	}
	
	/**
	 * Size getter
	 * @return size
	 */
	public double getSize() {
		return size;
	}
	
	/**
	 * Size setter
	 * @param size
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
    /**
     *Overridden toString() method. Returns size of shoe appended to Product class toString.
     */
    @Override
    public String toString(){
    	return super.toString() + "\n  Size: " + this.size + "\n\n";
    }

}