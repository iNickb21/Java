import java.applet.*;
import java.awt.*;

/**
 * Class Exercise3 - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Exercise3 extends Applet
{
    Label greeting = new Label("Hello.");
    
    Button pressMe =  new Button("enter");
    
    TextField answer = new TextField("", 10);
    
    public void init()
    {
        add(greeting);
        add(pressMe);
        add(answer);
    }
}
