/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author root
 */
public class Student extends Person{

    private int credits = 0;
    
    public Student(String name, String address) {
        super(name, address);
    }
    public int credits()
    {
        return this.credits;
    }
    public void study()
    {
        this.credits++;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n  credits "+this.credits;
    }
    
}
