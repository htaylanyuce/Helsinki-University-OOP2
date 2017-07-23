/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author root
 */
public class Person {

    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String toString()
    {
        return this.name;
    }

    @Override
    public int hashCode() {
        
        int k = 0;
        
        for(int i = 0; i < this.name.length();i++)
        {
            char str = this.name.charAt(i);
            k += str;
            
        }
        return k;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}