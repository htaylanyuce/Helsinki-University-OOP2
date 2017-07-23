package noticeboard;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import sun.awt.im.InputMethodJFrame;

public class NoticeBoard implements Runnable{

    private JFrame frame;

    @Override
    public void run() {

        this.frame = new JFrame();
        this.frame.setPreferredSize(new Dimension(400, 200));
        this.frame.setLayout(new GridLayout(3, 1));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame);
        
        this.frame.pack();
        this.frame.setVisible(true);
        
        
    }

    private void createComponents(Container container) {
        
        
        JTextField t1 = new JTextField("I was copied here from the JTextArea");
        
        JButton b = new JButton("Copy!");
        b.setPreferredSize(new Dimension(400, 50));
        
        JLabel t2 = new JLabel();
        
        Listener l = new Listener(t1, t2);
        
        b.addActionListener(l);
        
        
        this.frame.add(t1);
        this.frame.add(b);
        this.frame.add(t2);
        
        
        
    }

    
}
