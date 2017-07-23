
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuceh1
 */
public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();
    
    public Library() {
        
        
    }
    public void addBook(Book newBook)
    {
        library.add(newBook);
    }
    public void printBooks()
    {
        for(Book i : library)
            System.out.println(i.toString());
    }
    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> tt = new ArrayList<Book>();
       
        int index = 0;
        
        for(Book i : library)
        {
            
            
            if(StringUtils.included(i.title(),title))
            {
                tt.add(library.get(index));
            
            }
                index++;
        }
       
        return tt;
        
        
    }
    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> tt = new ArrayList<Book>();
       
        int index = 0;
        
        for(Book i : library)
        {
            
            
            if(StringUtils.included(i.publisher(), publisher))
            {            
                tt.add(library.get(index));
            }
             index++;
            
        }
       
        return tt;
        
        
        
    }
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> tt = new ArrayList<Book>();
       
        int index = 0;
        
        for(Book i : library)
        {
            int i1 = i.year();
            
            if(i1 == year)
            {
                tt.add(library.get(index));
                
            }
            index++;
        }
       
        return tt;
        
        
        
        
        
        
    }
}
