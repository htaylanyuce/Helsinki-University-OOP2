
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Change {

    private char from;
    private char to;
            
    
    public Change(char fromCharacter, char toCharacter)
    {
        this.from = fromCharacter;
        this.to = toCharacter;
    }
    public String change(String characterString)
    {
        int len = characterString.length();
        char [] myChars = characterString.toCharArray();
        String newString = "";
        
        for(int i = 0; i < len  ;i++)
        {
            if(myChars[i] == this.from)
                myChars[i] = this.to;
                
            newString += myChars[i];
        }
        
        
        return newString;
    }
}
