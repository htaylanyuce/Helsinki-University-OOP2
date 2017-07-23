/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class ContainerHistory {

    private ArrayList<Double> ds;
    public ContainerHistory() {
        ds = new ArrayList<Double>();
    }
    public void add(double situation)
    {
        ds.add(situation);
    }
    public void reset()
    {
        ds.clear();
    }
    public String toString()
    {
        return ds.toString();
    }
    public double maxValue()
    {
        if(ds.size() == 0)
            return 0;
        double max = ds.get(0);
        for(Double s : ds)
        {
            if(s > max)
                max = s;
        }
        return max;
    }
    public double minValue()
    {
        if(ds.size() == 0)
            return 0;
        double min = ds.get(0);
        for(Double s : ds)
        {
            if(s < min)
                min = s;
        }
        return min;
        
    }
    public double average()
    {
        
        if(ds.size() == 0)
            return 0;
        double total = 0;
        for(Double s : ds)
        {
            total += s;
        }
        return total / ds.size();
        
    }
    public double greatestFluctuation()
    {
        if(ds.size() <= 1)
            return 0 ;
        double start = ds.get(1) - ds.get(0);
        double newStart = 0;
        for(int i = 2 ; i < ds.size();i++)
        {
            newStart = ds.get(i) - (ds.get(i - 1));
            if(Math.abs(newStart) > Math.abs(start))
                start = newStart;
        }
        return Math.abs(start);
        //return maxValue() - minValue();
        
        
    }
    public double variance()
    {
        if(ds.size() <= 1)
            return 0 ;
        double avg = average();
        double var = 0;
        for(Double s : ds)
        {
            var += (s-avg) * (s-avg);
        }
        return var / (ds.size() - 1);
        
        
    }
    
}
