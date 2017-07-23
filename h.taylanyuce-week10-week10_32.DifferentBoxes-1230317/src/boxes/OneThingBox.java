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
public class OneThingBox extends Box{

    private ArrayList<Thing> bt;
    
    public OneThingBox() {
        bt = new ArrayList<Thing>();
    }
    

    @Override
    public void add(Thing thing) {
        if(bt.size() == 0)
            bt.add(thing);
            
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(bt.contains(thing))
            return true;
        return false;
    }
    
    
}
