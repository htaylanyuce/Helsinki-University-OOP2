
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Dictionary {

    private HashMap<String, String> dic;
    
            
    
    public Dictionary() {
        this.dic = new HashMap<String, String>();
    }
    
    public String translate(String word)
    {
        if(this.dic.containsKey(word))
            return this.dic.get(word);
        return null;
    }
    public void add(String word, String translation)
    {
        this.dic.put(word, translation);
    }
    public int amountOfWords()
    {
        return this.dic.size();
    }
    public ArrayList<String> translationList()
    {
        ArrayList<String> t = new ArrayList<String>();
        for(String key : dic.keySet())
        {
            t.add(key +" = "+dic.get(key));
        }
        return t;
    }
}
