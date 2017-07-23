/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author root
 */
public class Packer {

    
    private List<Box> boxes;
    private int tt;
    
    public Packer(int boxesVolume) {
        
        this.boxes= new ArrayList<Box>();
        this.tt = boxesVolume;
        
        
        
    }
    
    public List<Box> packThings(List<Thing> things)
    {
        
        Box b; 
        int load = 0;
        
        for(Thing t : things)
        {    
             
             b = new Box(this.tt);
             b.addThing(t);
             this.boxes.add(b);
        }
        return  this.boxes;
    }
    
}






