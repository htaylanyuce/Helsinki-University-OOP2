/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import com.sun.org.apache.bcel.internal.generic.BALOAD;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Farm implements Alive{
    
    private ArrayList<Cow> cCc;
    private String owner ;
    private Barn b;
    
    
    
    public Farm(String name, Barn b) {
        
        
        this.cCc = new ArrayList<Cow>();
        this.owner = name;
        this.b = b;
        
    }
    

    @Override
    public void liveHour() {
        
        for(Cow c : this.cCc)
        {
            c.liveHour();
        }
    }
    public String getOwner()
    {
        return this.owner;
    }
    public void addCow(Cow c)
    {
        this.cCc.add(c);
    }
    public void manageCows()
    {
        b.takeCareOf(this.cCc);
    }
    public void installMilkingRobot(MilkingRobot robot)
    {
        b.installMilkingRobot(robot);
    }
    public String toString()
    {
        BulkTank bt = b.getBulkTank();
        String str = "Farm owner: "+this.owner+"\n"+"Barn bulk tank: "+bt.toString()+"Animals: \n";
                
        String str2 = "";
        
        for(Cow c : this.cCc)
        {
            str2 += "        "+c.getName()+" "+c.getAmount()+"/"+c.getCapacity()+"\n";
        }
        String str3 = this.getOwner()+" is a tough guy!";
        return str+str2+str3;   
    }
}
