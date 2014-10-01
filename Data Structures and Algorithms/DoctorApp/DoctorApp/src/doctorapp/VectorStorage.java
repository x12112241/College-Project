package doctorapp;


import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Author X12112241
 */
public class VectorStorage {
    Vector patientlist;
    
    public VectorStorage()
    {
        patientlist = new Vector();
    }
   
    
    public static void main(String[] args) {
        
       
    }
    
    public void addPatient(String patient)
    {
         patientlist.add("Jon");
    }
    
    public void removePatient()
    {
        
    }
    
    public void removePatient(Integer pos)
    {
        
    }
    
}
