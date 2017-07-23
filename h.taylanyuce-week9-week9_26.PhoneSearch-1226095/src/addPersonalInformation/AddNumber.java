/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addPersonalInformation;

import java.util.*;

/**
 *
 * @author Cham
 */
public class AddNumber  {
    
    private Map<String, Set<String>> phoneStore;
    private Set <String> nameList;
    
    public AddNumber(){
        //this.nameList = new HashSet<String>();
        this.phoneStore = new HashMap<String, Set<String>>();
    }
    
    public void addName(Set<String> nameList){
        this.nameList = nameList;
    }
    
    public void addIt(String name, String number){
        if(!this.phoneStore.containsKey(name))
            this.phoneStore.put(name, new HashSet<String>());
        this.phoneStore.get(name).add(number);
    }
    public Map<String, Set<String>> getPhoneStore(){
        return this.phoneStore;
    }
    
    
}