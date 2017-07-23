
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Changer {

    ArrayList<Change> changes = new ArrayList<Change>();
    public Changer() {
        
    }
    public void addChange(Change change)
    {
        changes.add(change);
    }
    public String change(String characterString)
    {
        String s;
        s = changes.get(0).change(characterString);
        
        for(int i = 1; i < changes.size();i++)
        {
            s = changes.get(i).change(s);
        }
         return s;
    }
}
