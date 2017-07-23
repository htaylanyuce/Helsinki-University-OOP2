/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author root
 */
public class Cow implements Milkable,Alive{

    private Random r;
    private String name;
    private double amount = 0.0;
    private double capacity = 0.0;
    
     private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow() {
        r = new Random();
        int len = NAMES.length;
        int rand = r.nextInt(len);
        this.name = NAMES[rand];
        this.capacity = Math.ceil(getCapacity());
    }
    public Cow(String name) {
        this.name = name;
        this.capacity = Math.ceil(getCapacity());
    }
    public String getName()
    {
        return this.name;
    }
    public double getCapacity()
    {
        this.capacity =  15 + new Random().nextInt(26);
        return  this.capacity;
    }
    public double getAmount()
    {
        return this.amount;
    }
    @Override
    public String toString()
    {
        
        return this.getName()+" "+Math.ceil(milk())+"/"+Math.ceil(this.capacity);
    }

    @Override
    public double milk() {
        
      
        double ret = this.amount;
        this.amount = 0;
        return ret;
        
    }

    @Override
    public void liveHour() {
          this.amount +=  (double)(25 + new Random().nextInt(5))/24;
    }
    
    
}
