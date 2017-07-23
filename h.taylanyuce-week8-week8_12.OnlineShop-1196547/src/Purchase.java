
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cham
 */

public class Purchase {
    private Map<String , Integer> proUniPrice;
    private Map<String, Integer> proAmount;
    private String product;
    
    
    public Purchase(String product, int amount, int unitPrice){
        this.proAmount = new HashMap<String, Integer>();
        this.proUniPrice = new HashMap<String, Integer>();
        this.product = product;
        this.proUniPrice.put(product, unitPrice);
        this.proAmount.put(product, amount);
        
    }
    
    public int price(){
        return this.proAmount.get(this.product)*this.proUniPrice.get(this.product);
    }
    
   
    public void increaseAmount(){
        this.proAmount.put(this.product, this.proAmount.get(this.product)+1);
    }
    public String toString(){
        return this.product + ": " + this.proAmount.get(this.product); 
    }
    public int getPrice(){
        return this.proUniPrice.get(this.product);
    }
    
    
}