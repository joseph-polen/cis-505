/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

*/


/**
 * @author Joseph Polen
 * Class to represent a Student
 *
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private String course;
	private String grade;

	public Student() {
		super();
	}
	
	public Student(String firstName, String lastName, String course, String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getCourse() {
		return this.course;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/**
	 * Overridden toString() method.
	 */
	@Override
	public String toString() {
		System.out.printf(this.firstName + ',' +  this.lastName + "," + this.course + "," + this.grade + " \n");
		return "";
	}

}
