
import java.util.ArrayList;
import java.util.HashMap;
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

public class VehicleRegister {
    private HashMap<RegistrationPlate,String> haso;

    public VehicleRegister() {
        haso = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner)
    {
        if(!haso.containsKey(plate))
        {
            haso.put(plate, owner);
            return true;
        }
        
        return false;

    }
    public String get(RegistrationPlate plate){

        if(haso.containsKey(plate)) {
            return haso.get(plate);
        }
        
           return null;
       
    }
    public boolean delete(RegistrationPlate plate)
    {
        if(haso.containsKey(plate))
        {
            haso.remove(plate);
            return true;
        }
        
        return false;


    }
    public void printRegistrationPlates()
    {
        
        int size = haso.size();
        Set se = haso.keySet();
        for(RegistrationPlate t : haso.keySet())
        {
            System.out.println(t.toString());
            
        }
            
    }
    public void printOwners()
    {
        ArrayList<String> array = new ArrayList<String>();
        
        for(String s : haso.values())
        {
            
            if(!array.contains(s))
                System.out.println(s);
            array.add(s);
        }
    }
}

