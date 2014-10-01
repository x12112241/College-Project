/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author cmuntean
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Add at least 3 strings to the queue,
            Check the size of the queue,
            Add another 7 strings to the queue
            Dequeue some strings and print them.
            Check again the size of the queue
            Print the element at the front of the queue
            Test dequeueing from an empty queue.
         *
         */

        QueueInterface q = new MyQueue();
        q.enqueue("Element1");
        q.enqueue("Element2");
        q.enqueue("Element3");
        System.out.println("Added three elements");
        System.out.println("size is " + q.size());
        q.enqueue("Element4");
        q.enqueue("Element5");
        q.enqueue("Element6");
        q.enqueue("Element7");
        q.enqueue("Element8");
        q.enqueue("Element9");
        q.enqueue("Element10");
        System.out.println("Added seven more elements");
        System.out.println("size is " + q.size());

        System.out.println(q.frontElement() + " is at the Front");

        while (q.size() > 0) {
           System.out.println("dequeued: " + q.dequeue().toString());
           System.out.println("size is: " + q.size());
        }
    }

}
