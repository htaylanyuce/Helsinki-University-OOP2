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
public class BulkTank {
    
    private double capacity;
    private double volume = 0.0;
    
    public BulkTank()
    {
        this.capacity = 2000;
        
    }
    public BulkTank(double capacity)
    {
        this.capacity = capacity;
    }
    public double getCapacity()
    {
        return this.capacity;
                
    }
    public double getVolume()
    {
        return this.volume;
    }
    public double howMuchFreeSpace()
    {
        return this.capacity - this.volume;
    }
    public void addToTank(double amount)
    {
        double free = howMuchFreeSpace();
        if(free < amount)
            this.volume = this.capacity;
        else
            this.volume +=  amount;
    }
    public double getFromTank(double amount)
    {
        if(this.volume < amount)
            this.volume = 0;
        else
            this.volume -= amount;
        return this.volume;
    }
    public String toString()
    {
        return Math.ceil(volume)+"/"+Math.ceil(this.capacity);
    }
}
