
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
public class TextUserInterface {

    private Scanner sc;
    private Dictionary dic;
   
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.sc = reader;
        this.dic = dictionary;
        
             System.out.println("Statements:");
             System.out.println("    add - adds a word pair to the dictionary");
             System.out.println("    translate - asks a word and prints its translation");
             System.out.println("    quit - quit the text user interface");
        
    }
    public void start()
    {
        while(true)
        {
         
             System.out.print("Statement:");
             String s = (this.sc.next());
             
                                
             if(s.equals("quit"))
             {
                 System.out.println("Cheers!");
                 break;
             }
             else if(s.equals("add"))
             {
                    add();
                    break;
             }
             else if(s.equals("translate"))
             {
                    translate();
                    break;
             }
                 
        }       
        
    }
    public void add()
    {
        String fin;
        System.out.print("In Finnish: ");
        while(true)
        {
            fin = this.sc.nextLine();
            if(!fin.isEmpty())
                break;
        
         }
        System.out.println("");
           System.out.print("In ENglish: ");
            String eng = this.sc.nextLine();
            System.out.println("");
        
        this.dic.add(fin, eng);
        start();
        
        
    }
    public void translate()
    {
        System.out.print("Give a word: ");
        String word;
        
        while(true)
        {
            word = this.sc.nextLine();
            if(!word.isEmpty())
                break;
        }
        start();
        System.out.println("Translation: "+this.dic.translate(word));
        
    }
    
    
}
