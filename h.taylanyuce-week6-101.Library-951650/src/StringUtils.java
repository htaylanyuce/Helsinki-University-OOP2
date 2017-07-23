/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuceh1
 */
public class StringUtils {
    
    public static boolean included(String word, String searched)
    {
        boolean x = false;
        
        if(word.isEmpty() || searched.isEmpty())
            return false;
        
        String wor = word.trim();
        String wor1 = wor.toUpperCase();
        
        
        String searc = searched.trim();
        String searc1 = searc.toUpperCase();
        
        
        if(wor1.contains(searc1)){
            
           x =  true;
            
        }
        return x;
        
    }
}
