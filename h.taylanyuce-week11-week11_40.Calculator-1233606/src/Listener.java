
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Listener implements ActionListener{

    private JTextField c;
    private JTextField c1;
    private int action;
    private JButton j;
    private int change = 0;
    
    public Listener(JTextField c, JTextField c1, JButton anm) {
        
        this.change = 1;
        this.c = c;
        this.c1 = c1;
        this.j = anm;
        
            
    }
     public Listener(JTextField c, JTextField c1, int action,JButton j) {
        
        this.c = c;
        this.c1 = c1;
        this.j = j;
        
        if(action == 1)
            this.action = 1;
        else if(action == 2)
            this.action = 2;
        else 
            this.action = 3;
            
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(this.change == 0)
        {   
            try{
                String sal = this.c.getText();
                int val = Integer.parseInt(sal);
        
                String sal1 = this.c1.getText();
                int n = Integer.parseInt(sal1);
                
                if(this.action == 1)
                    val += n;
                else if(this.action == 2)
                    val -= n;
        
                if(val == 0)
                    this.j.setEnabled(false);
                else
                    this.j.setEnabled(true);

                this.c.setText(val+"");
                this.c1.setText("");
            }
            catch (Exception ex){
                this.c1.setText("");
            }
        }
        else
        {   
            this.c.setText("0");
            this.j.setEnabled(false);
            this.c1.setText("");
        }
        
        
    }
    
}
