import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**
 * Class Exercise2 - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Exercise2B extends Applet implements ActionListener
{
    Label label1 = new Label("Enter two numbers.");
    Button button1 =  new Button("+");
    TextField input1 = new TextField("",10);
    TextField input2 = new TextField("",10);
    
    int inputText = 0;
    int inputText2 = 0;
    int total = 0;
    
    public void init()
    {
        add(label1);
        add(input1);
        add(input2);
        add(button1);
        input1.requestFocus();
        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       inputText = Integer.parseInt(input1.getText());
       inputText2 = Integer.parseInt(input2.getText());
       total = inputText + inputText2;
       label1.setText("The total is " + total + ".");
       
       invalidate();
       validate();
    }
}
