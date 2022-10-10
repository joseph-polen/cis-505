/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
rights reserved.
*/

import java.util.List;



/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Interface for Generic DAO from example given in assignment 6.2
 */

public interface GenericDao<E, K> {
	
	List<E> findAll();
	E findBy(K key);
	void insert(E entity);

}
