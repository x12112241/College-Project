/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package singlelinkedlist;

/**
 *
 * Author X12112241
 */
public interface LinearList {
        public boolean isEmpty();
	public int size();
	public Object get(int index);
	public void remove(int index);
	public void add(int index, Object theElement);
	public void printList();


}
