/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TaxofficeApp;
import java.util.*;

/**
 *
 * @author x12112241
 */
public class MyQueue implements QueueInterface {
  private ArrayList<String> theQueue;       

  /* Creates a new instance of MyQueue class */  
  public MyQueue() {
        theQueue = new ArrayList<String>();    
  } 

  public boolean isEmpty() { 
     return theQueue.isEmpty(); 
  }
  
  public int size(){
	  return theQueue.size();
  }

  public Object frontElement() {
    if (theQueue.size() > 0 )
	return theQueue.get(0);
    else 
	return null;
  }
  
  public void enqueue(Object element){
    theQueue.add((String)element);
  }

  public Object dequeue() {
      return theQueue.remove(0);
  }
} //end of the MyQueue class
