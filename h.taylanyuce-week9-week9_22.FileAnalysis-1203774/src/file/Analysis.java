
package file;

import com.sun.media.sound.SoftAbstractResampler;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    
    
    private File t;
    private Scanner sc ;
    private int counter = 0;
    private int wordCount = 0;
    
    public Analysis(File file)
    {
        t = file;
        
    }
    public int lines() throws FileNotFoundException
    {
        
        int line_n = 0;
         
        Scanner s = new Scanner(this.t);
                
        while (s.hasNextLine()) {
             
            String line = s.nextLine();
            if(!line.isEmpty())
                line_n++;
            
        }
    
        s.close();
        return line_n;
    }
    public int characters() throws FileNotFoundException
    {
        int count = 0;
        Scanner s = new Scanner(this.t);
                
        while (s.hasNextLine()) {
             
            String line = s.nextLine();
            if(!line.isEmpty())
            {
                count += line.length() + 1;
            }
        }
    
        s.close();
        return count;
       
     
        
    }
    
    
    
}
