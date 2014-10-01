/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TaxofficeApp;

/**
 *
 * @author x12112241
 */
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public void enqueue(Object element);
    public Object dequeue();

}
