/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class Employees {

    private ArrayList<Person> list;
    
    public Employees() {
        this.list = new ArrayList<Person>();
    }
    
    public void add(Person person)
    {
        this.list.add(person);
    }
    public void add(List<Person> persons)
    {
         Iterator<Person> iterator = persons.iterator();
         
         while(iterator.hasNext())
         {
             Person p = iterator.next();
             this.list.add(p);
         }
        
    }
    public void print()
    {
       Iterator<Person> iterator = this.list.iterator();

       Person p;
        while (iterator.hasNext()) {
            
            p = iterator.next();
            System.out.println(p);
            
        }
                
                
                
    }
    public void print(Education education)
    {
        
        Iterator<Person> iterator = this.list.iterator();

        Person p;
                
        while (iterator.hasNext()) {
            
            p = iterator.next();
            
            if(p.getEducation() == education)
            {
                
                System.out.println(p);
            }  
        }
        
        
        
    }
    public void fire(Education education)
    {
        Iterator<Person> iterator = this.list.iterator();

        Person p;
                
        while (iterator.hasNext()) {
            
            if(iterator.next().getEducation() == education)
            {
                iterator.remove();
                
            }
           
            
        }
    }
    
    
}
