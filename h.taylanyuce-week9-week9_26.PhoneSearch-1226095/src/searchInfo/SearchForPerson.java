/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchInfo;

import addPersonalInformation.AddNumber;
import java.util.*;

/**
 *
 * @author Cham
 */
public class SearchForPerson {
 
    private AddNumber catchIt;
    private String number;
    public SearchForPerson (String number, AddNumber catchIt){
        this.number = number;
        this.catchIt = catchIt;
    }
    
    public void findHim(){
        Map<String , Set<String>> phoneStore = this.catchIt.getPhoneStore();
        int i=0;
        for (String name : phoneStore.keySet()){
            for (String numbers : phoneStore.get(name)){
                if (numbers.equals(this.number)){
                    System.out.println(" "+name);
                    i++;
                }
                    
            }
        }
        if (i == 0)
            System.out.println("  not found");
            
            
        
    }
}