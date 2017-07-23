/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class Box implements Thing{
    private int maxCap;
    private List<Thing> tt;
    
    
    public Box(int maximumCapacity)
    {
        this.maxCap = maximumCapacity;
        tt = new ArrayList<Thing>();
    }
    public boolean addThing(Thing thing)
    {
        int total = 0;
        for(Thing t : this.tt)
        {
            total += t.getVolume();
        }
        if((total + thing.getVolume()) <= this.maxCap)
        {
            this.tt.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int total = 0;
        for(Thing t : this.tt)
        {
            total += t.getVolume();
        }
        return total;
        
    }

}
