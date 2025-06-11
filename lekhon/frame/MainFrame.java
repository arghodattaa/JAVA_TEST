package frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame {
    public MainFrame(){
         JFrame frame = new JFrame();
        frame.setTitle("Game Play System");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(500,140);
        frame.setVisible(true); 

        ImageIcon icon = new ImageIcon("C:\\Users\\USER\\Desktop\\lekhon\\image\\logo.png");



        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground( new Color(47,45,45));
    }
}
