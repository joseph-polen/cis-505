/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
rights reserved.
*/

import java.util.LinkedList;

/**
 * @author Joe Polen 
 * CIS-505 Bellevue University
 * 
 * Class for the generic queue
 */

public class GenericQueue<E> {
	
	//Create generic linked list
	private LinkedList<E> list = new LinkedList<E>();
	

	/**
	 * No argument constructor
	 */
	public GenericQueue() {
		super();
	}
	
	/**
	 * Method for queuing an item
	 * @param item
	 */
	public void enqueue(E item) {
		list.addFirst(item);
	}
	
	/**
	 * Generic return method for return item from list
	 * @return E list item
	 */
	public E dequeue() {
		
		return (E) list.removeFirst();
	}
	
	/**
	 * Method for returing size of list
	 * @return
	 */
	public int size() {
		return list.size();
	}

}