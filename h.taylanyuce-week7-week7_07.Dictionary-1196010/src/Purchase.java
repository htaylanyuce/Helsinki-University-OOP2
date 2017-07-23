/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Purchase {
    
    private int amount;
    private int unitPrice;
    private String product;

    
    public Purchase(String product, int amount, int unitPrice)
    {
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.product = product;
        
    }
    public int price()
    {
        return this.unitPrice *this.amount;
    }
    public void increaseAmount()
    {
        this.unitPrice++;
    }
    public String toString()
    {
        return this.product+": "+this.unitPrice;
    }
    
}
 