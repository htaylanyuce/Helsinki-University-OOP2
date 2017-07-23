/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author root
 */
public class Thermometer implements Sensor{

    private int counter = 0;
    @Override
    public boolean isOn() {
        if(this.counter % 2 == 0)
            return false;
        else
            return true;
        
    }

    @Override
    public void on() {
        this.counter = 1;
    }

    @Override
    public void off() {
        this.counter = 0;
    }

    @Override
    public int measure() {
        
        on();
        Random rand = new Random();
        if(isOn())
            return rand.nextInt(60)-30;
        throw new IllegalStateException();
    }
    
    
    
    
    
}
