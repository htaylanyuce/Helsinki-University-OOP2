
import java.util.ArrayList;
import javax.print.DocFlavor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Suitcase {

    private ArrayList<Thing> suit = new ArrayList<Thing>();
    
    private int Max_Weight; 
    
    
    public Suitcase(int max) {
        this.Max_Weight = max;
    }
    public void addThing(Thing thing)
    {
        int total_Weight =0 ;
        
        for(int i = 0; i < this.suit.size();i++)
        {
            
            total_Weight += this.suit.get(i).getWeight();
           
            
        }
        if(total_Weight + thing.getWeight() <= this.Max_Weight)
            suit.add(thing);
        
        
    }
    public void printThings()
    {
        for(int i = 0; i < this.suit.size(); i++)
        {
            System.out.println(this.suit.get(i).getName()+" ("+this.suit.get(i).getWeight()+" kg)");
            
        }
        
    }
    public int totalWeight()
    {
        int total_Weight = 0;
        
        for(int i = 0; i < this.suit.size();i++)
        {
            
            total_Weight += this.suit.get(i).getWeight();
           
            
        }
        return total_Weight;
    }
    public Thing heaviestThing()
    {
         int index_Max = 0;
       
       if(this.suit.size() == 0) 
       {
           return null;
       }
       else 
       {
            int max = this.suit.get(0).getWeight();
           
            for(int i = 1 ; i < this.suit.size();i++)
            {
                if(max < this.suit.get(i).getWeight())
                {
                    max = this.suit.get(i).getWeight();
                    index_Max = i;
               
                }
            }
        
       }
        return this.suit.get(index_Max);
    }
            
    public String toString()
    {
        String s ;
        
        int total_Weight = 0;
        
        for(int i = 0; i < this.suit.size();i++)
        {
            
            total_Weight += this.suit.get(i).getWeight();
           
            
        }
        if(this.suit.size() == 0)
        {
              
            return "empty (0 kg)";
            
        }
        else if(this.suit.size() == 1)
        {
            s = "1 thing ("+total_Weight+" kg)";
            
            return s;
            
        }
        else
        {
            s = this.suit.size()+" things ("+total_Weight+" kg)";
            
            return s;
        }
      
        
        
    }
}
