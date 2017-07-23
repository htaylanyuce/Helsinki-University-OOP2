/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class MaxWeightBox extends Box{

    private ArrayList<Thing> bx;
    private int boxMax;
    public MaxWeightBox(int maxWeight)
    {
        this.boxMax = maxWeight;
        bx = new ArrayList<Thing>();
         
    }
    @Override
    public void add(Thing thing) {
        
        int total = 0;
        
        for(Thing b : bx)
        {
            total += b.getWeight();
        }
        if(total + thing.getWeight() <= this.boxMax)
            bx.add(thing);
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        boolean x = bx.contains(thing);
        return x;
    }
    
    
    
}
