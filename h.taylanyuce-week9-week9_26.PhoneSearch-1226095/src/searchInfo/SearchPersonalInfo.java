/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchInfo;

import addPersonalInformation.AddAddress;
import addPersonalInformation.AddNumber;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cham
 */
public class SearchPersonalInfo {
    private String name;
    private Set<String> nameList;
    private AddAddress addressInfo;
    private AddNumber phoneInfo;    
    
    public SearchPersonalInfo(String name, AddAddress addressInfo, AddNumber phoneInfo , Set<String> nameList){
        this.name = name;
        this.nameList = nameList;
        this.addressInfo = addressInfo;
        this.phoneInfo = phoneInfo;
    }
    
    public void findIt(){
        Set<String> numnum = new HashSet<String>();
        if (this.nameList.contains(this.name)){
        if (this.addressInfo.getaddressStore().containsKey(this.name))
            System.out.println("address: " + this.addressInfo.getaddressStore().get(this.name));
        else 
            System.out.println("  address unknown");
        if (this.phoneInfo.getPhoneStore().containsKey(this.name)){
            numnum = this.phoneInfo.getPhoneStore().get(this.name);
            System.out.println("phone numbers: ");
            for (String num : numnum){
                System.out.println(" " +num);
            }
        }
        else
            System.out.println("phone number not found");
        }
        else
            System.out.println("  not found");
    }
}