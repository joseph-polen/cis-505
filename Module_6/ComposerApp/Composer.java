/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class for the composer
 */

public class Composer {

	//Couldn't figure out how to initialize id to an empty string as per the instructions, kept getting an exception
	private Integer id = 0;
	private String name = "";
	private String genre = "";

	/**
	 * No argument constructor
	 */
	public Composer() {
		super();
	}

	/**
	 * Argument constructor
	 * 
	 * @param id
	 * @param name
	 * @param genre
	 */
	public Composer(Integer id, String name, String genre) {
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	/**
	 * id getter
	 * 
	 * @return id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * name getter
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * genre getter
	 * 
	 * @return genre
	 */
	public String getGenre() {
		return this.genre;
	}

	/**
	 * id setter
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * name setter
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * genre setter
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Overridden toString() method. Gives composer description.
	 */
	@Override
	public String toString() {
		System.out
				.printf("\n  Id: " + this.id + '\n' + "  Name: " + this.name + "\n" + "  Genre: " + this.genre + "\n");
		return "";
	}

}
