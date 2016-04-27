import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Chapter6_test extends Applet implements ActionListener
{
   Frame frame = new Frame();
   Label label1 = new Label("Welcome to Chapter 6 Test");
   
   Button button1 = new Button("Sum Numbers");
   
   TextField text1 = new TextField(20);
   TextField text2 = new TextField(20);
   TextField text3 = new TextField(30);
   
   Font before = new Font("Arial",Font.PLAIN,18);
   Font after = new Font("Arial",Font.BOLD,24);
   

   public void init ()
   {
      add(label1);
      
      add(text1);
      add(text2);
      add(text3);
      
      text1.setText("Enter 1st number");
      text2.setText("Enter 2nd number");
      text3.setText("Enter name");
      
      label1.setFont(before);
      add(button1);
      button1.addActionListener(this);
      button1.setActionCommand("Hi");
      frame.setSize(250,250);
      setBackground(Color.CYAN);
      label1.setForeground(Color.GREEN);
   }

  public void actionPerformed(ActionEvent e)
  {
      String input = e.getActionCommand();
      if(input.equals("Hi"))
      {
        setBackground(Color.YELLOW);
        label1.setForeground(Color.RED);
        label1.setFont(after);
        int num1 =  Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int answer = num1 + num2;
        label1.setText(text3.getText() + " will make a " + String.valueOf(answer) + " on the chapter 6 test");
    }
    invalidate();
    validate();
  }
}
