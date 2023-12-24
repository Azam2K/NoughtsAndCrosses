import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Color;

public class MainView extends JFrame{

    private JFrame frame;
    private JPanel panel;

    private JLabel copyrightLabel;

    public MainView(){
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(800,500);//this makes the window 800 width by 500 height
        panel.setBackground(new Color(34,34,34));//sets the color of the background
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this makes sure the frame closes correctly
        frame.add(panel);//this adds the panel to the window
        panel.setLayout(null);
        frame.setLocationRelativeTo(null);//this ALWAYS opens the frame in the middle of your screen
        frame.setResizable(false);//user cannot resize the frame
        copyrightLabel = new JLabel("Azam Asif © 2023");
        copyrightLabel.setBounds(2,440,200,20);
        copyrightLabel.setForeground(Color.white);
        panel.add(copyrightLabel);
    }
    public void addCustomComponent(javax.swing.JComponent component) {//this lets callers add things
        panel.add(component);
    }

    public void set(){
        frame.setVisible(true);
    }

    public void setTitle(String input){
        frame.setTitle(input);
    }

    public void unset(){
        frame.setVisible(false);
    }

    public void setDimensions(int x, int y){
        frame.setSize(x,y);
    }



}


