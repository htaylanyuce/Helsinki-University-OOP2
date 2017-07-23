package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class UserInterface implements Runnable {
    private JFrame frame;


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        PersonalCalculator pc = new PersonalCalculator();
        this.frame.setLayout(new GridLayout(2, 1));
        
        JLabel j = new JLabel("0");
        
        JButton b = new JButton("Click!");
        
        ClickListener cl = new ClickListener(pc, j);
        
        b.addActionListener(cl);
        
                
                
        this.frame.add(j);
        this.frame.add(b);
    }

    public JFrame getFrame() {
        return frame;
    }
}
