/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author root
 */
public class MilkingRobot {

    private BulkTank bt ;
  
    public MilkingRobot() {
        
    }
    
    public BulkTank getBulkTank()
    {
        if(bt == null)
            return null;
        return bt;
    }
    public void setBulkTank(BulkTank tank)
    {
        bt = tank;
        
    }
    public void milk(Milkable milkable) 
    {
        if(bt == null)
            throw  new IllegalStateException();
        milkable.milk();
    }
    
    
    
    
    
    
    
}
