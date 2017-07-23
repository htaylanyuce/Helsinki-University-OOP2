
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class PromissoryNote {

    private HashMap<String, Double> t ;
    
    public PromissoryNote() {
        
        t = new HashMap<String, Double>();
        
    }
    public void setLoan(String toWhom, double value)
    {
        t.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose) 
    {
        if(t.containsKey(whose))
            return t.get(whose);
        else
            return 0;
    }
}
