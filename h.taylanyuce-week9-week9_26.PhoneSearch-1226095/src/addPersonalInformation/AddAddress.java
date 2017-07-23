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
public class AddAddress {
    Map<String, String> addressStore;
    Set<String> nameList;
    
    public AddAddress(){
        this.addressStore = new HashMap<String, String>();
        this.nameList = new HashSet<String>();
    }
    
    public void addName(Set<String> nameList){
        this.nameList = nameList;
    }
    
    public void addIt(String name, String address){
        if(!this.addressStore.containsKey(name))
            this.addressStore.put(name, address);
        
    }
    public Map<String, String> getaddressStore(){
        return this.addressStore;
    }
}