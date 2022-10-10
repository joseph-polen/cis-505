/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

How do I find an element in java list? Tutorials Point. (n.d.). Retrieved October 9, 2022, 
from https://www.tutorialspoint.com/how-do-i-find-an-element-in-java-list 
*/

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class for storing composer memory
 */

public class MemComposerDao {

	// Create list of composers
	private List<Composer> composers = new ArrayList<Composer>();

	/**
	 * No argument constructor
	 */
	public MemComposerDao() {

		super();

		// Create default composers
		Composer beethoven = new Composer(1007, "Ludwig Van Beethoven", "Classical");
		Composer bach = new Composer(1008, "Johann Sebastion Bach", "Classical");
		Composer mozart = new Composer(1009, "Wolfgang Amadeus Mozart", "Classical");
		Composer brahms = new Composer(1010, "Johannes Brahms", "Classical");
		Composer haydn = new Composer(1011, "Joseph Haydn", "Classical");

		// Add default composers to list
		composers.add(beethoven);
		composers.add(bach);
		composers.add(mozart);
		composers.add(brahms);
		composers.add(haydn);

	}

	/**
	 * Method for returning the list of composers
	 * 
	 * @return composers
	 */
	public List<Composer> findAll() {

		return composers;
	}

	/**
	 * Method for finding a composer by ID
	 * 
	 * @param id
	 * @return item (composer object)
	 */
	public Composer findBy(Integer id) {

		// Composer object for return
		Composer item = new Composer();

		// Iterate over composer list and assign item to the composer object that is found by matching id
		for (Composer composer : composers) {
			if (composer.getId().equals(id)) {
				item = composer;
			}
		}

		return item;

	}

	/**
	 * Method for inserting a composer into the list
	 * 
	 * @param composer
	 */
	public void insert(Composer composer) {
		composers.add(composer);
	}

}