
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private Scanner sc;
    private ArrayList<String> hs ;
    File fl ;

    public FileManager() {
       hs = new ArrayList<String>();
    }
    
    public List<String> read(String file) throws FileNotFoundException {
        
        fl = new File(file);
        sc = new Scanner(fl);
        
        
        while(sc.hasNextLine())
        {
            String str = "";
            str = sc.nextLine();
            hs.add(str);
        }
        
        
        return hs;
    }

    public void save(String file, String text) throws IOException {
        
        
        FileWriter f = new FileWriter(file);
        f.write(text);
        f.close();
        
    }

    public void save(String file, List<String> texts) throws IOException {
        
        FileWriter f = new FileWriter(file);
        
        for(String s : texts)
        {
            f.write(s);
            f.write("\n");
                        
        }
        f.close();
        
    }
}
