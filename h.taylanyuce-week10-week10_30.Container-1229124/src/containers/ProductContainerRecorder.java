/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author root
 */
public class ProductContainerRecorder extends ProductContainer{
    
    private ContainerHistory ch;
    
    
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) 
    {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        
        
        ch = new ContainerHistory();
        ch.add(initialVolume);
    }
    public String history()
    {
        
        return ch.toString();
    }
    public void addToTheContainer(double amount)
    {
        super.addToTheContainer(amount);
        double d = super.getVolume();
        ch.add(super.getVolume());
        
    }
    public double takeFromTheContainer(double amount)
    {
        double s = super.takeFromTheContainer(amount);
        
        ch.add(super.getOriginalCapacity() - super.getCurrentCapacity());
        return s;
    }
    public void printAnalysis()
    {
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+ch.toString());
        System.out.println("Greatest product amount: "+ch.maxValue());
        System.out.println("Smallest product amount: "+ch.minValue());
        System.out.println("Average: "+ch.average());
        System.out.println("Greatest change: "+ch.greatestFluctuation());
        System.out.println("Variance: "+ch.variance());
        
                
               
    }
    
    
    
}
