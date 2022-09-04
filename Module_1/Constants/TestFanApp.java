/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

/**
 * @author Joe Polen
 *TestFanApp class. Creates objects of type Fan.
 */
public class TestFanApp{
    public static void main(String[] args) {
    
    	//Create default fan object
        Fan fanDefault = new Fan();
        
        //Create custom fan object
        Fan fanConstructor = new Fan(Fan.MEDIUM, true, 8.0, "Blue");

        //Print fan objects using overridden toString() method
        System.out.printf(fanDefault.toString() + '\n');
        System.out.printf(fanConstructor.toString());
       
    }
}