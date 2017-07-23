/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author root
 */
public class ClickListener implements ActionListener{

    private Calculator c;
    private JLabel j;
    
    public ClickListener(Calculator c, JLabel j) {
    
        this.c = c;
        this.j = j;
        
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        c.increase();
        this.j.setText(c.giveValue()+"");
    }
    
}
