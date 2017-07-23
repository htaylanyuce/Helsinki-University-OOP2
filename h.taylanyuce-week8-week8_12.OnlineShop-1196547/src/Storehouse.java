
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Storehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    
    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    

    public void addProduct(String product, int price, int stock)
    {
        this.prices.put(product, price);
        this.stocks.put(product, stock);

    }
    public int price(String product)
    {
        if(this.prices.containsKey(product))
            return  this.prices.get(product);
        return -99;
    }
    public int stock(String product)
    {
        if(this.stocks.containsKey(product))
            return this.stocks.get(product);
        else
            return 0;
    }
    public boolean take(String product)
    {
        
        if(this.stocks.containsKey(product) && this.stocks.get(product)>0)
        {
            this.stocks.put(product, (this.stocks.get(product)-1));
            return true;
           
        }
        return false;
    }
   public Set<String> products(){
        Set<String> set = new HashSet<String>();
        for(String key : this.stocks.keySet()){
            set.add(key);
        }
        return set;
    }


}