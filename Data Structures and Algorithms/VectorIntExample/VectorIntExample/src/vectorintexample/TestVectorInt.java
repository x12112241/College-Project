/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vectorintexample;

/**
 *
 * Author X12112241
 */
import java.util.*;
public class TestVectorInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector vInts;
        int i;
        vInts= new Vector();

        // add to the Vector type collection 15 consecutive numbers from 0 to 14
	for(i = 0;i<15;i=i+1)
	{
            vInts.add(i);
	}
	// print all the elements from the colection using toString() method
        System.out.println("Vector contains the following numbers: " + vInts.toString());

	//Shuffle the elements of the collection
        Collections.shuffle(vInts);
        System.out.println("After shuffle:" + vInts.toString());

        
	//Use an Iterator to access each element and print the element value
        System.out.println("Print the elements using an Iterator...");
        Iterator iter = vInts.iterator();
        while (iter.hasNext())
	{
            System.out.println("Number: " + iter.next());
	}
    }
}
