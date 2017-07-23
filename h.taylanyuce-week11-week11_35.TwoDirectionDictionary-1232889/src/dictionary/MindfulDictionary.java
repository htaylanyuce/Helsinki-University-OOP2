/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class MindfulDictionary {

    private HashMap<String,String> hs ;
    private HashMap<String,String> hsReverse;
    private String fileName ;
    
    public MindfulDictionary() {
        this.hs = new HashMap<String, String>();
        
        this.hsReverse = new HashMap<String, String>();
        
    }
    public MindfulDictionary(String file) throws FileNotFoundException
    {
        this.hs = new HashMap<String, String>();
        
        this.hsReverse = new HashMap<String, String>();
        
        this.fileName = file;
    }
    public boolean save()
    {
        
        FileWriter f = null;
        int control = 0;
        try {
            f = new FileWriter(this.fileName);
            
        
            for(String s : this.hs.keySet())
            {
                control++;
                f.write(s+":"+hs.get(s));
                f.write("\n");
            
            }   
            f.close();
        }
        catch (IOException ex)
                {
                    Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
        return true;
         
        
    }
  public boolean load(){
      
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File(this.fileName));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }       
        while ( fileReader.hasNextLine() ){
            String line = fileReader.nextLine();
            String[] parts = line.split(":");   // the line is split at :
            this.add(parts[0], parts[1]);
        }
        return true;
    }
        
    
            
    public void add(String word, String translation)
    {
        
        if(!this.hs.containsKey(word))
        {
            this.hs.put(word, translation);
            
        }
        if(!this.hsReverse.containsKey(translation))
        {
            
            this.hsReverse.put(translation,word);
            
        }
        
        
        
    }
    public String translate(String word)
    {
        if(this.hs.containsKey(word))
            return this.hs.get(word);
        else if(this.hsReverse.containsKey(word))
            return this.hsReverse.get(word);
        return null;
    }
    public void remove(String word)
    {
        String trans = "";
        String word1 = "";
        
        if(this.hs.containsKey(word))
        {
            trans = this.hs.get(word);
        
            if(this.hsReverse.containsKey(trans))
                this.hsReverse.remove(trans);
            this.hs.remove(word);
        }        
        if(this.hsReverse.containsKey(word))
        {
            word1 = this.hsReverse.get(word);
                    
            if(this.hs.containsKey(word1))
                this.hs.remove(word1);
            this.hsReverse.remove(word);
        }
        
    }
    
}
