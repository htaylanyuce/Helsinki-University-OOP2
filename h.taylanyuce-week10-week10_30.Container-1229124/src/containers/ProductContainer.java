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
public class ProductContainer extends Container{
    
    private String name;
    
    public ProductContainer(String productName, double capacity)
    {
        super(capacity);
        super.setName(productName);
        this.name = productName;
    }
    public String getName()
    {
        
        return super.getName();
    }
    
}
