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
public class BlackHoleBox extends Box{

    private ArrayList< Thing> bt;
    
    public BlackHoleBox()  {
        bt = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        bt.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
    
}
