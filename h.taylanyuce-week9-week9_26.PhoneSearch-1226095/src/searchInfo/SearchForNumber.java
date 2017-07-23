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
public class SearchForNumber {
    private String name;
    private AddNumber searchIn;
    
    public SearchForNumber(String name, AddNumber addNum){
        this.name = name;
        this.searchIn = addNum;
    }
    
    public void searchIt(){
        Set<String> numnum = new HashSet<String>();
        if (this.searchIn.getPhoneStore().containsKey(this.name)){
            numnum = this.searchIn.getPhoneStore().get(this.name);
            for (String num : numnum){
                System.out.println(" " +num);
            }
        }
        else
            System.out.println("  not found");
        
    }
}