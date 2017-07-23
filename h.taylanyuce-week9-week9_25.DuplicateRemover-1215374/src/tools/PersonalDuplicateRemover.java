/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author root
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    //private Map<String,Set<Integer>> st;
    private Set<String> st;
    private int detected = 0;
    
    public PersonalDuplicateRemover() {
        st = new HashSet<String>();
           
    }

    @Override
    public void add(String characterString) {

        if(this.st.contains(characterString))
           this.detected++;
            
        this.st.add(characterString);
            
        
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        
        return this.detected;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        
        return (Set<String>) this.st;
    }

    @Override
    public void empty() {
        
        this.detected = 0;
        this.st.removeAll(st);
        
    }
    
    
}
