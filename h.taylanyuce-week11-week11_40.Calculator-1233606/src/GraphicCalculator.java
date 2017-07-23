
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300, 200));
        this.frame.setLayout(new GridLayout(3, 1));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
        
        
    }

    private void createComponents(Container container) {
        
        JTextField txt = new JTextField("0");
        txt.setEnabled(false);
        
        JTextField input = new JTextField("");
        
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1, 3));
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("Z");
        
        b1.addActionListener(new Listener(txt,input, 1,b3));
        b2.addActionListener(new Listener(txt,input, 2,b3));
        b3.addActionListener(new Listener(txt,input, b3));
        b3.setEnabled(false);
        
        
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        
        GraphicCalculator c = new GraphicCalculator();
        
     
        
        
        this.frame.add(txt);
        this.frame.add(input);
        this.frame.add(jp);
    }

    public JFrame getFrame() {
        return frame;
    }
}