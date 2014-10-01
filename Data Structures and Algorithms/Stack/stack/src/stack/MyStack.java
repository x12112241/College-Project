/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.util.*;

/**
 *
 * Author X12112241
 */
public class MyStack implements StackInterface {
    private ArrayList<String> theStack;

    /** Creates a new instance of Stack */
    public MyStack()
    {
        theStack = new ArrayList<String>();
    }


    public boolean isEmpty()
    {
        return theStack.isEmpty();
    }
    /** always false as there is no limit on the size of this arraylist based stack */

    public boolean isFull()
    {
        return false;
    }

    /** removes the item  from the top of the stack
     and returns it */
    public Object pop()
    {
        if (!(theStack.isEmpty()))
        {
             return theStack.remove(0);
        }
        else
		return null;
    }


    /** puts an item onto the top of the stack */
    public void push(Object newItem)
    {
          theStack.add(0, (String)newItem);

    }

// removes all elements from the stack
    public void emptyStack()
    {
        while (!theStack.isEmpty())
        {
            pop();
        }
    }

    // return a String object that consists of all elements from the stack
   public String displayStack()
   {
       Iterator it;
       String str = new String() ;
       it = theStack.iterator();
       if(theStack.isEmpty())
       {
           str = str.concat("STACK IS EMPTY!");
       }
       else
       {
            while (it.hasNext()){
                str = str.concat((String)it.next());
                str = str.concat(";");
           }
       }
       return str;
   }
}
