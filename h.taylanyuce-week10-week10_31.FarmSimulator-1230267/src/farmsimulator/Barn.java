/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author root
 */
public class Barn {

    private BulkTank bt = null;
    private double totalMilk =0;
    
    public Barn(BulkTank tank) {
        bt = tank;
    }
    public BulkTank getBulkTank()
    {
        return bt;
        
    }
    public void installMilkingRobot(MilkingRobot milkingRobot)
    {
        milkingRobot.setBulkTank(bt);
    }
    public void takeCareOf(Cow cow)
    {
        if(bt == null)
            throw  new IllegalStateException();
        this.totalMilk = cow.milk();
        bt.addToTank(cow.milk());
        
    }
    public void takeCareOf(Collection<Cow> cows)
    {
        if(bt == null)
            throw  new IllegalStateException();
        for(Cow c : cows)
        {
            
            bt.addToTank(c.milk());
        }
    }
    public String toString()
    {
        return "Barn: "+bt.toString();
        
    }
    
}
