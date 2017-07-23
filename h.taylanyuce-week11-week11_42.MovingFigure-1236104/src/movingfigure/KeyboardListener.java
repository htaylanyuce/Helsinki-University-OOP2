/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author root
 */
public class KeyboardListener implements KeyListener{

    private Component c;
    private Figure f;
    
    public KeyboardListener(Component c, Figure f) {
        this.c = c;
        this.f = f;
    }

    
    
    @Override
    public void keyTyped(KeyEvent e) {
     
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            
            this.f.move(-1, 0);
            this.c.repaint();
            
                   
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            System.out.println("right");
            this.f.move(1, 0);
            this.c.repaint();
            
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            System.out.println("left");
            this.f.move(0, -1);
            this.c.repaint();
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            this.f.move(0, 1);
            this.c.repaint();
            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       this.c.repaint();
    }
    
}
