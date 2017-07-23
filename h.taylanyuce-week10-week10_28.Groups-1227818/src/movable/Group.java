/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Group implements Movable{
    
    private ArrayList<Organism> group;

    public Group() {
        this.group = new ArrayList<Organism>();
    }
    
    
    public String toString()
    {
        String ret ="";
        for(Organism s : this.group)
        {
             ret += s.toString()+"\n";
        }
        return ret;
    }
    
    public void addToGroup(Movable movable)
    {
        this.group.add((Organism)movable);
    }
    @Override
    public void move(int dx, int dy)
    {
        for(Organism s: this.group)
        {
            s.move(dx, dy);
        }
        
    }
}
