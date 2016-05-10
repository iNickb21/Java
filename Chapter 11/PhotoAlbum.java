import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class PhotoAlbum implements ActionListener
{
    JFrame frame;
    JPanel contentPane;
    JButton button;
    JLabel imgLabel;
    
    int imageIndex = 1;
    
    String[] images = {"Koala.jpg", "Chrysanthemum.jpg", "Desert.jpg", "Hydrangeas.jpg", "Jellyfish.jpg", "Lighthouse.jpg", "Penguins.jpg", "Tulips.jpg"};
    
    public PhotoAlbum()
    {
        frame = new JFrame("PhotoAlbum");
        contentPane = new JPanel();
        button = new JButton("Next Image");
        imgLabel = new JLabel(new ImageIcon("Koala.jpg"));
        
        contentPane.add(imgLabel);
        contentPane.add(button);
       
        button.addActionListener(this);
        
        frame.setContentPane(contentPane);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent event)
    {
        if(imageIndex >=7)
            imageIndex = 0;
        
        
        imgLabel.setIcon(new ImageIcon(images[imageIndex]));
        imageIndex++;
    }
}
