/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package licenseapp;
import java.util.*;
/**
 *
 * Author X12112241
 */
public class LicenseApp {
  public static void main(String[] args) {
    
        LicenseInterface l = new ApplicationList();
        l.enqueue("Element1");
        l.enqueue("Element2");
        l.enqueue("Element3");
        System.out.println("Added three elements");
        System.out.println("size is " + l.size());
        l.enqueue("Element4");
        l.enqueue("Element5");
        l.enqueue("Element6");
        l.enqueue("Element7");
        l.enqueue("Element8");
        l.enqueue("Element9");
        l.enqueue("Element10");
        System.out.println("Added seven more elements");
        System.out.println("size is " + l.size());

        System.out.println(l.frontElement() + " is at the Front");

        while (l.size() > 0) {
           System.out.println("dequeued: " + l.dequeue().toString());
           System.out.println("size is: " + l.size());
        }
    }

    }

