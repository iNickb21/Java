
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Cities implements ActionListener
{
    JFrame frame;
    JPanel contentPane;
    JLabel label;
    JTextField input1;
    JButton button1;
    
    String city = "";
    String longestCity = "";
    int numCities = 0;
    
    public Cities()
    {
        frame = new JFrame("Cities");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input1 = new JTextField("",10);
        contentPane = new JPanel();
                
        label = new JLabel("");
        
        
        //GridLayout formLayout = new GridLayout(0,3);
        //contentPane.setLayout(formLayout);
        
        button1 = new JButton("Enter");
        
        button1.setActionCommand("button1pressed");     
        
        button1.addActionListener(this);
                
        
        
        contentPane.add(input1);
        contentPane.add(button1);
        contentPane.add(label);
        frame.setContentPane(contentPane);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        String eventName = event.getActionCommand();
        
        if(input1.getText().equalsIgnoreCase("stop"))
        {
            label.setText( "You entered " + numCities + " cities. The longest is " + longestCity);
            
        }
        
        else if( eventName.equals("button1pressed"))
        {
            numCities++;
            label.setText( numCities + " Cities entered.");
            city = input1.getText();
            if(city.length() > longestCity.length())
                longestCity = city;
        }
    }
}
