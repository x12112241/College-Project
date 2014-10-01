/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * Author X12112241
 */
public class StackTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
      StackInterface si = new MyStack();
      System.out.println("Stack is empty is " + si.isEmpty());

      /*Complete the testing of the stack behaviour by invoking
       all the methods implemented in MyStack class to:

       //* push some (e.g. 3) items onto the stack ( Strings type)
      //* check if the stack is empty now
      //* Pop 2 items +  print them out
      //* check if the stack is empty now
      //* Empty the stack  ( pop any remaining items )
      //* Pop an empty stack to see what happens */

      si.push("One String");
      si.push("Second String");
      si.push("Another String");
      System.out.println("pushed three items");

      System.out.println("Stack is empty is " + si.isEmpty());

      System.out.println("The stack has the following elements: "+si.displayStack());
      si.emptyStack();
      System.out.println("All elements were removed");
      System.out.println("Stack is empty is " + si.isEmpty());

      /*
       String out;
      out = (String)si.pop();
      System.out.println("popped: " + out );
      out = (String)si.pop();
      System.out.println("popped: " + out );

      System.out.println("Stack is empty is " + si.isEmpty());

      out = (String)si.pop();
      System.out.println("popped: " + out );

      out = (String)si.pop();
      System.out.println("popped: " + out );
       */
     
    }

}
