
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Printer {
    
    private File f;
    public Printer(String fileName) throws Exception
    {
        f = new File(fileName);
       
    }
    public void printLinesWhichContain(String word) throws FileNotFoundException
    {
        
        Scanner s = new Scanner(this.f);
                
        while (s.hasNextLine()) {
             
            String line = s.nextLine();
            if(line.contains(word))
                System.out.println(line);
            
        }

        s.close();
    }
    
}
