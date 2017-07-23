
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Container {

    private ArrayList<Suitcase> con = new ArrayList<Suitcase>();
    private int max_Weight;
    private int w = 0;
    
    public Container(int weight) {
        this.max_Weight = weight;
        
    }
    public void addSuitcase(Suitcase suitcase)
    {
        int x = w + suitcase.totalWeight();
        if(x <= this.max_Weight)
        {
            w += suitcase.totalWeight();
            con.add(suitcase);
        }
            
    }
    public String toString()
    {
        String s = ""+this.con.size();
        int total = 0;
        
        for(int i = 0 ; i < this.con.size();i++)
        {
            total += this.con.get(i).totalWeight();
        }
        return s+" suitcases ("+total+" kg)";
    }
    public void printThings()
    {
        Suitcase tt;
        for(int i = 0 ; i < this.con.size(); i++)
        {
           this.con.get(i).printThings();
           
        }
    }
}
