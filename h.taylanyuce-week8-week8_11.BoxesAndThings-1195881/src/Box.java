
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
public class Box implements ToBeStored{
    
    private ArrayList<ToBeStored> stor;
    private double max;

    public Box(double max) {
        this.stor = new ArrayList<ToBeStored>();
        this.max = max;
    }
    public void add(ToBeStored tool)
    {
        double kg = weight();
        if((kg + tool.weight()) <= this.max)        
            stor.add(tool);
        
        
    }
    public double weight() {
        double weight = 0;
        
        for(int i = 0 ; i < stor.size();i++)
        {
            weight += stor.get(i).weight();
            
        }
        
        return weight;
    }
    public String toString()
    {
        return "Box: "+this.stor.size()+" things, total weight "+ Math.floor(this.weight())+" kg";
              
    }
    
    
    
}
