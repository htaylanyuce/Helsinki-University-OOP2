
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class RingingCentre {
    
    private Map<Bird,ArrayList<String>> hs;

    public RingingCentre() {
        
        hs = new HashMap<Bird, ArrayList<String>>();
    }
    
    
    public void observe(Bird bird, String place)
    {
        if(!hs.containsKey(bird))
        {
            hs.put(bird,new ArrayList<String>());
            hs.get(bird).add(place);
        }
           
        else
            hs.get(bird).add(place);
        
            
        
            
    }
    public void observations(Bird bird)
    {
        int howMany  = 0;
        
        System.out.print(bird.getName()+" ("+bird.getYear()+") observations: ");
       
         
        if(hs.containsKey(bird))
        {
            for(int i = 0 ; i < hs.get(bird).size();i++)
            {
              
                howMany++;
            }
        }
         System.out.println(howMany);
        
        if(hs.containsKey(bird))
        {
            for(int i = 0 ; i < hs.get(bird).size();i++)
            {
                System.out.println(hs.get(bird).get(i)+"");
                howMany++;
            }
        }
       
    }
    
}
