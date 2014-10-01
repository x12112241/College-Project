/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * Author X12112241
 */
public interface StackInterface {

    public boolean isEmpty();
    public boolean isFull();
    public void push(Object newItem);
    public Object pop();
    public void emptyStack();
    public String displayStack();

}
