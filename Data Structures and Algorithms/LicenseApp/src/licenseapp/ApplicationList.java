/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package licenseapp;

import java.util.ArrayList;

/**
 *
 * Author X12112241
 */
public class ApplicationList implements LicenseInterface{
    private ArrayList<String> theQueue;
    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
        public ApplicationList() {
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
    
}
