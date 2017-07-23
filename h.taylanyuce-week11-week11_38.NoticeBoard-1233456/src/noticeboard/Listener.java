/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author root
 */
public class Listener implements ActionListener{

    private JTextField txt;
    private JLabel label;

    public Listener(JTextField j, JLabel l) {
        this.txt = j;
        this.label = l;
                
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.label.setText(this.txt.getText());
        this.txt.setText("");
        
    }
    
}
