package survey;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import sun.awt.im.InputMethodJFrame;

public class UserInterface implements Runnable {

    private JFrame frame;
    

    @Override
    public void run() {
        // Create your app here
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(200, 300));
        this.frame.setLayout(new BoxLayout(this.frame.getContentPane(), BoxLayout.Y_AXIS));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        ButtonGroup group1 = new ButtonGroup();
        
        group1.add(yes);
        group1.add(no);
        this.frame.add(yes);
        this.frame.add(no);
        this.frame.add(new JLabel("Why?"));
        JRadioButton noReason = new JRadioButton("No reason!");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        
        ButtonGroup group2 = new ButtonGroup();
        group2.add(noReason);
        group2.add(fun);
        this.frame.add(noReason);
        this.frame.add(fun);
        JButton b = new JButton("Done!");
        b.setPreferredSize(new Dimension(50, 50));
        b.setVisible(true);
        this.frame.add(b);
        
        
        this.frame.pack();
        this.frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }
}
