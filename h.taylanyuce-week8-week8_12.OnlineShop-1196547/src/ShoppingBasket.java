
import java.util.HashMap;
import java.util.Map;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class ShoppingBasket {

    private Map<String, Purchase> purchases;
    
    public ShoppingBasket() {
        
        this.purchases = new HashMap<String, Purchase>();
    }
     
    public void add(String product, int price)
    {
        if(!this.purchases.containsKey(product))        
        {
            this.purchases.put(product, new Purchase(product, 1,price));
            
        }
        else
            this.purchases.get(product).increaseAmount();
    }
    public int price()
    {
       
        
       int sum = 0;
        for(String item : this.purchases.keySet()){
            sum += this.purchases.get(item).price();
        }
        return sum;
    }
    public void print()
    {
        
        for(String item : this.purchases.keySet())
        {
            
            System.out.println(this.purchases.get(item)+": "+this.purchases.get(item));   
    
    
        }
    }
    
}
