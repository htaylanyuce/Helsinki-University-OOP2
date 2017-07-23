/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class CompoundFigure extends Figure{

    private ArrayList<Figure> comp;
    
    public CompoundFigure() {
        super(0, 0);
        comp = new ArrayList<Figure>();
    }
    

    @Override
    public void draw(Graphics graphics) {
        
        for(Figure f : this.comp)
        {
            f.draw(graphics);
        }
        
    }
    public void add(Figure f)
    {
         this.comp.add(f);
    }
    

    public void move(int dx, int dy) {
        for (Figure figure : this.comp){
            figure.move(dx, dy);
        }
    
    
}}
