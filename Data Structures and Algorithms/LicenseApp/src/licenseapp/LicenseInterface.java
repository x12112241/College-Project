/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package licenseapp;

/**
 *
 * Author X12112241
 */
public interface LicenseInterface {

    public boolean isEmpty();

    public int size();

    public Object frontElement();

    public void enqueue(Object element);

    public Object dequeue();
}
