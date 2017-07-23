/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchInfo;

import addPersonalInformation.AddAddress;
import addPersonalInformation.AddNumber;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Cham
 */
public class SearchByKeyword {

    private String keyWord;
    private Set<String> nameList;
    private AddAddress addressInfo;
    private AddNumber phoneInfo;

    public SearchByKeyword(String name, AddAddress addressInfo, AddNumber phoneInfo, Set<String> nameList) {
        this.keyWord = name;
        this.nameList = nameList;
        this.addressInfo = addressInfo;
        this.phoneInfo = phoneInfo;
    }
    /*
     List sortedKeys=new ArrayList(yourMap.keySet());
Collections.sort(sortedKeys);
     */

    public void findIt() {
        List<String> list = new ArrayList<String>(this.nameList);
        Collections.sort(list);
        List<String> sortedAddressKeys=new ArrayList<String>(this.addressInfo.getaddressStore().keySet());
        Collections.sort(sortedAddressKeys);  
        List<String> sortedNumberKeys=new ArrayList<String>(this.phoneInfo.getPhoneStore().keySet());
        Collections.sort(sortedNumberKeys);
        Set<String> numnum = new HashSet<String>();
        int i = 0;
        if (this.keyWord.isEmpty()) {
            i++;
            for (String name : list) {
                System.out.println(name);
                if (this.addressInfo.getaddressStore().containsKey(name)) {
                    System.out.println("address: " + this.addressInfo.getaddressStore().get(name));
                } else {
                    System.out.println("  address unknown");
                }
                if (this.phoneInfo.getPhoneStore().containsKey(name)) {
                    System.out.println("phone number: ");
                    numnum = this.phoneInfo.getPhoneStore().get(name);
                    for (String num : numnum) {
                        System.out.println(" " + num);
                    }
                } else {
                    System.out.println("phone number not found");
                }
            }
        }

        for (String name : sortedNumberKeys) {
            if (name.contains(this.keyWord)) {
                i++;
                System.out.println(name);
                if (this.addressInfo.getaddressStore().containsKey(name)) {
                    System.out.println("address: " + this.addressInfo.getaddressStore().get(name));
                } else {
                    System.out.println("  address unknown");
                }
                System.out.println("phone numbers: ");
                numnum = this.phoneInfo.getPhoneStore().get(name);
                for (String num : numnum) {
                    System.out.println(" " + num);
                }
            }
        }

        for (String name : sortedAddressKeys) {
            if (this.addressInfo.getaddressStore().get(name).contains(this.keyWord)) {
                i++;
                System.out.println(name);
                System.out.println("address: " + this.addressInfo.getaddressStore().get(name));
                if (this.phoneInfo.getPhoneStore().containsKey(name)) {
                    System.out.println("phone number: ");
                    numnum = this.phoneInfo.getPhoneStore().get(name);
                    for (String num : numnum) {
                        System.out.println(" " + num);
                    }
                } else {
                    System.out.println("phone number not found");
                }
            }
        }

        if (i == 0) {
            System.out.println(" keyword not found");
        }
    }
}