/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Bhati, S. S. (2019, March 19). Accessors and Mutators in Java. C# Corner. 
Retrieved September 4, 2022, from https://www.c-sharpcorner.com/UploadFile/3614a6/accessors-and-mutators-in-java/ 

Overriding tostring() method in Java. GeeksforGeeks. (2022, February 25). Retrieved September 4, 2022, 
from https://www.geeksforgeeks.org/overriding-tostring-method-in-java/ 

*/

/**
 * @author Joe Polen
 * Class that creates a fan
 */
public class Fan{
	
	//Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    //Fan data
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";
    
    /**
     * Fan speed getter
     * @return returns speed
     */
    public int getSpeed(){
    	return speed;
    }
    
    /**
     * Fan on getter
     * @return returns on
     */
    public boolean getOn(){
    	return on;
    }
    
    /**
     * Fan radius getter
     * @return returns radius
     */
    public double getRadius(){
    	return radius;
    }
    
    /**
     * Fan color getter
     * @return returns color
     */
    public String getColor(){
    	return color;
    }
    
    /**
     * Fan speed setter
     * @param speed int
     * Sets speed
     */
    public void setSpeed(int speed){
    	this.speed = speed;
    }
    
    /**
     * Fan on setter
     * @param on boolean
     * Sets fan on/off
     */
    public void setOn(boolean on){
    	this.on = on;
    }
    
    /**
     * Fan radius setter
     * @param radius double
     * Sets fan radius
     */
    public void setRadius(double radius){
    	this.radius = radius;
    }
    
    /**
     * Fan color setter
     * @param color String
     * Sets fan color
     */
    public void setColor(String color){
    	this.color = color;
    }
    
    /**
     * Fan class no argument constructor
     * Creates default fan
     */
    public Fan(){
    	super();
    }
    
    /**
     * Fan constructor
     * @param speed int
     * @param on boolean
     * @param radius double
     * @param color String
     */
    public Fan(int speed, boolean on, double radius, String color){
    	this.speed = speed;
    	this.on = on;
    	this.radius = radius;
    	this.color = color;
    }
    
    /**
     *Overridden toString() method. Gives fan description when called.
     */
    @Override
    public String toString(){
    	if(this.on) {
    		return "The fan speed is set to " + this.speed + " with a color of " + this.color + " and a radius of " + this.radius;
    	}else {
    		return "The fan is " + this.color + " with a radius of " + this.radius + " and the fan is off.";
    	}
    }
}