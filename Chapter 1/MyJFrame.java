import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyJFrame implements ActionListener
{
   JFrame frame;
   JPanel panel;
   JTextField enter;
   JButton press;
   
   public MyJFrame()
   {
    frame =  new JFrame("Hunter JFrame");    
    panel = new JPanel();
    enter =  new JTextField(10);
    press = new JButton("ok");
    
    frame.add(panel);
    panel.add(enter);
    panel.add(press);
    frame.setVisible(true);
    //frame.setSize(200,200);
    frame.pack();
    press.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   { 
     press.setText(enter.getText()); 
   }
   
}
