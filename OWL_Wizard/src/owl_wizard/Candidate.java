/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package owl_wizard;

/**
 *
 * @author shsu
 */
public class Candidate implements Comparable{
    
    
    String name;
    int weighting;
    
    Candidate (String n, int w)
    {
        name = n;
        weighting = w;
        
    }
    
    public int compareTo (Object o)
    {
        return weighting - ((Candidate) o).weighting;
    }
    
}
