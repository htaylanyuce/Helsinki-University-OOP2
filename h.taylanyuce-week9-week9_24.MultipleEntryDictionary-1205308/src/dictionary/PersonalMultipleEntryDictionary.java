/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author root
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String,Set<String>> tt;

    public PersonalMultipleEntryDictionary() {

        this.tt = new HashMap<String, Set<String>>();
        
    }
    
    @Override
    public void add(String word, String entry) {
        
        if(!this.tt.containsKey(word))
            this.tt.put(word, new HashSet<String>());
        
        Set<String> a = this.tt.get(word);
        a.add(entry);
        
        
                
    }

    @Override
    public Set<String> translate(String word) {
        
            return this.tt.get(word);
    }

    @Override
    public void remove(String word) {
        if(this.tt.containsKey(word))
        {
            Set<String> a = this.tt.get(word);
            this.tt.remove(word);
            
        }
        
    }
    
    
}
