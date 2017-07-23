/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class DrawingBoard extends JPanel{

    private Figure f ;
    
    public DrawingBoard(Figure f) {
        this.f = f;
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        f.draw(g);
        
    }
    
    
}
