/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author Cham
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensorList;
    private List<Integer> measuringList;
    
    public AverageSensor(){
        this.sensorList = new ArrayList<Sensor>();
        this.measuringList = new ArrayList<Integer>();
    }
    
  
    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensorList){
            if (!sensor.isOn())
                return false;
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensorList)
            sensor.on();
    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensorList )
            sensor.off();
    }

    /*
    The measure method of our AverageSensor returns the average of the readings of all its sensors (because the return value is int, the readings are rounded down as it is for integer division). 
    If the measure method is called when the average sensor is off, or if the average sensor was not added any sensor, the method throws an IllegalStateException.
    */
    
    @Override
    public int measure() {
        int average = 0;
        if (!this.isOn() || this.sensorList.isEmpty())
            throw new IllegalStateException();
        for (Sensor sensor : this.sensorList)
            average += sensor.measure();
        average = average/(this.sensorList.size());
        this.measuringList.add(average);
        return this.measuringList.get(this.measuringList.size() -1);
        
    }
    
    public void addSensor(Sensor additional){
        this.sensorList.add(additional);
    }
    
    public List<Integer> readings(){
        
        return this.measuringList;
    }
}