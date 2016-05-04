import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**
 * Class Exercise2 - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Exercise2 extends Applet implements ActionListener
{
    Label label1 = new Label("Enter Password");
    Button button1 =  new Button("Log In");
    TextField input1 = new TextField("",10);
    
    String input = "";

    public void init()
    {
        add(label1);
        add(button1);
        add(input1);
        input1.requestFocus();
        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       input = input1.getText();
       
       if(input.equalsIgnoreCase("Rosebud")||input.equalsIgnoreCase("Redrum")||input.equalsIgnoreCase("Jason")||input.equalsIgnoreCase("Surrender")||input.equalsIgnoreCase("Dorothy"))
           label1.setText("Access Granted");
       else
           label1.setText("Access Denied");
       invalidate();
       validate();
    }
}
