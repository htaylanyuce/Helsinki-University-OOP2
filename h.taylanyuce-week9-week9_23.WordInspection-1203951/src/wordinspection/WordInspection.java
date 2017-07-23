/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class WordInspection {
    
    private File f;
    
    private List<String> z ;
    private List<String> end;
    private List<String> palin;
    private List<String> all;
    
    
    public WordInspection(File file)
    {
        
        f = file;
        end = new ArrayList<String>();
        z = new ArrayList<String>();
        palin = new ArrayList<String>();
        all = new ArrayList<String>();
    }
    public int wordCount() throws FileNotFoundException{
         
        int line_n = 0;
         
        Scanner s = new Scanner(this.f);
                
        while (s.hasNextLine()) {
             
            String line = s.nextLine();
            if(!line.isEmpty())
                line_n++;
            
        }
    
        s.close();
        return line_n;
         
         
    }
    public List<String> wordsContainingZ() throws FileNotFoundException
    {
        int z_number = 0;
        Scanner s = new Scanner(this.f);
                
        while (s.hasNextLine()) {
             
            String line = s.nextLine();
            if(!line.isEmpty() && line.contains("z"))
            {
                z_number++;
                z.add(line);
            }
            
        }
    
        s.close();
        return z;
        
    }
    public List<String> wordsEndingInL() throws FileNotFoundException
    {
        
        int len;
        Scanner s = new Scanner(this.f);
                
        while (s.hasNextLine()) 
        {
             
            String line = s.nextLine();
            len = line.length();
            
            if(!line.isEmpty() && (line.substring(len-1).equals("l")))
            {
                end.add(line);
            }
            
        }
    
        s.close();
        return end;
    }
    public List<String> palindromes() throws FileNotFoundException
    {
        
        Scanner s = new Scanner(this.f);
                
        
        while (s.hasNextLine()) {
        
            String reverse = "";
            String line = s.nextLine();
           
            
            if(!line.isEmpty())
            {
                int len = line.length();
 
                for ( int i = len - 1 ; i >= 0 ; i-- )
                {
                    reverse = reverse + line.charAt(i);
                }
                if(reverse.equals(line))
                
                    palin.add(line);
            }
            
        }
    
        s.close();
        return palin;
        
    }
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException
    {
        Scanner s = new Scanner(this.f);
        
        while (s.hasNextLine()) {
             
            String line = s.nextLine();
            char[] array = {'a','e','y','o','u','i','ö'};
            
            if(!line.isEmpty() && line.contains("a") && line.contains("o")&&line.contains("ö")&&
                    line.contains("u")&&line.contains("y")&&line.contains("i")&&line.contains("e")&&line.contains("ä"))
            {
                
                all.add(line);
            }
            
        }
        return all;
    }
    
}
