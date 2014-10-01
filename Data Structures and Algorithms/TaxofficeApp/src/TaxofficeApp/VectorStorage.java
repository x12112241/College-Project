package TaxofficeApp;


import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x12112241
 */
public class VectorStorage {
    Vector applicantlist;
    
    public VectorStorage()
    {
        applicantlist = new Vector();
    }
   
    
    public static void main(String[] args) {
        
       
    }
    
    public void addApplication(String patient)
    {
         applicantlist.add("Jon");
    }
    
    public void removeApplication()
    {
        
    }
    
    public void removeApplication(Integer pos)
    {
        
    }
    
}
