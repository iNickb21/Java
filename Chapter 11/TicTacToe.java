 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacToe implements ActionListener
{
    final static String LABEL_TEXT = "X goes first.";
    JFrame frame;
    JPanel contentPane;
    JLabel label;
    
    JButton button1_1;
    JButton button1_2;
    JButton button1_3;
    JButton button2_1;
    JButton button2_2;
    JButton button2_3;
    JButton button3_1;
    JButton button3_2;
    JButton button3_3;
    
    int xoro = 0;
    int turnNumber = 0;
    int gameOver = 0;
    
    public TicTacToe()
    {
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = new JPanel();
                
        label = new JLabel(LABEL_TEXT);
        
        
        GridLayout formLayout = new GridLayout(0,3);
        contentPane.setLayout(formLayout);
        
        button1_1 = new JButton();
        button1_2 = new JButton();
        button1_3 = new JButton();
        button2_1 = new JButton();
        button2_2 = new JButton();
        button2_3 = new JButton();
        button3_1 = new JButton();
        button3_2 = new JButton();
        button3_3 = new JButton();
        
        button1_1.setActionCommand("button1_1_pressed");
        button1_2.setActionCommand("button1_2_pressed");
        button1_3.setActionCommand("button1_3_pressed");
        button2_1.setActionCommand("button2_1_pressed");
        button2_2.setActionCommand("button2_2_pressed");
        button2_3.setActionCommand("button2_3_pressed");
        button3_1.setActionCommand("button3_1_pressed");
        button3_2.setActionCommand("button3_2_pressed");
        button3_3.setActionCommand("button3_3_pressed");     
        
        button1_1.addActionListener(this);
        button1_2.addActionListener(this);
        button1_3.addActionListener(this);
        button2_1.addActionListener(this);
        button2_2.addActionListener(this);
        button2_3.addActionListener(this);
        button3_1.addActionListener(this);
        button3_2.addActionListener(this);
        button3_3.addActionListener(this);
                
        contentPane.add(button1_1);
        contentPane.add(button1_2);
        contentPane.add(button1_3);
        contentPane.add(button2_1);
        contentPane.add(button2_2);
        contentPane.add(button2_3);
        contentPane.add(button3_1);
        contentPane.add(button3_2);
        contentPane.add(button3_3);
        
        contentPane.add(label);
        
        frame.setContentPane(contentPane);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        String eventName = event.getActionCommand();
        
            if(xoro == 0)
            {
                JButton buttn = (JButton)event.getSource();
                label.setText("O's turn.");
                buttn.setText("X");
                buttn.setEnabled(false);
                xoro = 1;
            }
            else if(xoro == 1)
            {
                JButton buttn = (JButton)event.getSource();
                label.setText("X's turn.");
                buttn.setText("O");
                buttn.setEnabled(false);
                xoro = 0;
            }
            turnNumber++;
            
            //across x
            if((button1_1.getText() == "X" && button1_2.getText() == "X" && button1_3.getText() == "X")||(button2_1.getText() == "X" && button2_2.getText() == "X" && button2_3.getText() == "X")||(button3_1.getText() == "X" && button3_2.getText() == "X" && button3_3.getText() == "X"))
            {
                label.setText("X Wins");
                gameOver = 1;
            }
            
            //down x
            else if((button1_1.getText() == "X" && button2_1.getText() == "X" && button3_1.getText() == "X")||(button1_2.getText() == "X" && button2_2.getText() == "X" && button3_2.getText() == "X")||(button1_3.getText() == "X" && button2_3.getText() == "X" && button3_3.getText() == "X"))
            {
                label.setText("X Wins");
                gameOver = 1;
            }
                
            // diagonal x
            else if((button1_1.getText() == "X" && button2_2.getText() == "X" && button3_3.getText() == "X")||(button3_1.getText() == "X" && button2_2.getText() == "X" && button1_3.getText() == "X"))
            {
                label.setText("X Wins");
                gameOver = 1;
            }
                
            //across o
            else if((button1_1.getText() == "O" && button1_2.getText() == "O" && button1_3.getText() == "O")||(button2_1.getText() == "O" && button2_2.getText() == "O" && button2_3.getText() == "O")||(button3_1.getText() == "O" && button3_2.getText() == "O" && button3_3.getText() == "O"))
            {
                label.setText("O Wins");
                gameOver = 1;
            }
            
            //down o
            else if((button1_1.getText() == "O" && button2_1.getText() == "O" && button3_1.getText() == "O")||(button1_2.getText() == "O" && button2_2.getText() == "O" && button3_2.getText() == "O")||(button1_3.getText() == "O" && button2_3.getText() == "O" && button3_3.getText() == "O"))
            {
                label.setText("O Wins");
                gameOver = 1;
            }
                
            // diagonal o
            else if((button1_1.getText() == "O" && button2_2.getText() == "O" && button3_3.getText() == "O")||(button3_1.getText() == "O" && button2_2.getText() == "O" && button1_3.getText() == "O"))
            {
                label.setText("O Wins");
                gameOver = 1;
            }
            
            else if(turnNumber == 9)
                label.setText("Nobody Wins");
                
                
           if (gameOver == 1)
           {
               button1_1.setEnabled(false);
               button1_2.setEnabled(false);
               button1_3.setEnabled(false);
               button2_1.setEnabled(false);
               button2_2.setEnabled(false);
               button2_3.setEnabled(false);
               button3_1.setEnabled(false);
               button3_2.setEnabled(false);
               button3_3.setEnabled(false);
           }
    }
}
