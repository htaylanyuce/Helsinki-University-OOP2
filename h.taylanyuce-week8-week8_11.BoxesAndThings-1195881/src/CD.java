/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class CD implements ToBeStored{
    
    private String title;
    private String artist;
    private int year;
    private float weight;
    
    public CD(String artist,String title,int year) {
        
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1f;
                
    }
 
    @Override
    public double weight() {
        return this.weight;
        
    }
    public String toString()
    {
        return this.artist+": "+this.title+" ("+this.year+")";
              
    }
    
}
