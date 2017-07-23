package greeter.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import org.fest.swing.applet.AppletViewer;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Swing on");
        this.frame.setPreferredSize(new Dimension(400, 200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        JLabel text = new JLabel("Hi!");
        container.add(text);
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
